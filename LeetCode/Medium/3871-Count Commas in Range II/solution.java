class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long power = 1000;
        long commas = 1;

        while (n >= power) {
            ans += (n - power + 1) * commas;

            power *= 1000;
            commas++;
        }

        return ans;
    }
}