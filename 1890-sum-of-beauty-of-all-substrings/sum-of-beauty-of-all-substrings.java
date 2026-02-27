class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                if (j - i >= 2) {
                    ans += getBeauty(freq);
                }
            }
        }
        return ans;
    }
    private int getBeauty(int[] freq) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f > 0) {
                max = Math.max(max, f);
                min = Math.min(min, f);
            }
        }
        return max - min;
    }
}