package cb;

public class KartikBhaiyaSubString {
    public static void main(String[] args) {
        String q = "ababbbaabaabbbbbb";
        int k = 2;
        int n = q.length();

        System.out.println(Math.max(maximumSubString(q, k, n, 'a'), maximumSubString(q, k, n, 'b'))); // leetcode
    }

    static int maximumSubString(String s, int k, int n, char ch) {
        int flip = 0;
        int ans = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            //increase window
            if (s.charAt(right) == ch) flip++;

            //decrease window
            while (flip > k && left <= right) {
                if (s.charAt(left) == ch) flip--;
                left++;
            }

            //count subarrays
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
