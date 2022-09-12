package cb;

public class MinimumWindowSubString {
    //    https://leetcode.com/problems/minimum-window-substring/
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int n = s.length();
        int m = t.length();

        System.out.println(minWindow(s, t, n, m));// leetcode
    }

    static String minWindow(String s, String t, int n, int m) {
        int[] map = new int[128];
        for (int i = 0; i < m; i++) {
            map[t.charAt(i)]++;
        }
        int count = m;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        for (int right = 0; right < n; right++) {
            //increase window
            if (map[s.charAt(right)] > 0) count--;
            map[s.charAt(right)]--;

            //decrease window
            while (count == 0 && left <= right) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }
                map[s.charAt(left)]++;
                if (map[s.charAt(left)] > 0) count++;
                left++;
            }
        }
        return ans;
    }
}
