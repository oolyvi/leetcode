class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int i = 0; i < count.length; i++) {
            length += (count[i] / 2) * 2;

            if (count[i] % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }
}
