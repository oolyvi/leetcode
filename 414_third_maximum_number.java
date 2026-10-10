class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() < 3) {
            return Collections.max(set);
        }

        return set.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
    }
}
