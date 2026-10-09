class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int digit = num & 15;
            result.append(hex.charAt(digit));
            num >>>= 4;
        }

        return result.reverse().toString();
    }
}
