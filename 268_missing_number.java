class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 0 ? 1 : 0;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }

        if (nums[0] != 0) {
            return 0;
        }

        return nums[nums.length - 1] + 1;
    }
}
