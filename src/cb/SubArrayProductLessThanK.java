package cb;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k = 100;
        int n = arr.length;

        System.out.println(subArrayProductLessThanK(arr, k, n)); // leetcode
    }

    static int subArrayProductLessThanK(int[] arr, int k, int n) {
        int product = 1;
        int count = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            //increase window
            product *= arr[right];

            //decrease window
            while (product >= k && left <= right) {
                product /= arr[left];
                left++;
            }

            //count subarrays
            count += right - left + 1;
        }
        return count;
    }
}
