class Solution {
    public int arrangeCoins(int n) {
        int m = 1;

        while (n > 0) {
            n -= m++;
        }

        return (n == 0) ? m - 1 : m - 2;
    }
}
