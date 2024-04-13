class Solution {
    static Long reversedBits(Long x) {
        String s = "";
        for (long i = 0; i <= 31; i++) {
            if ((x & (1L << i)) != 0) {
                s = '1' + s;
            } else {
                s = '0' + s;
            }
        }
        Long ans = 0L;
        for (long i = 0; i <= 31; i++) {
            if (s.charAt((int)i) == '1') {
                ans += (1L << i);
            }
        }
        return ans;
    }
}
