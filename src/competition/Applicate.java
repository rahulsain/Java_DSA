package competition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Applicate {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the name from the input
        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //Write your answer here


        // print the Output
        System.out.println(maxProfit(k, n, arr));
    }

    static int maxProfit(int k, int n, int[] prices) {
        {
            int[][] profit = new int[k + 1][n + 1];

            for (int i = 0; i <= k; i++)
                profit[i][0] = 0;

            for (int j = 0; j <= n; j++)
                profit[0][j] = 0;
            for (int i = 1; i <= k; i++) {
                int prevDiff = Integer.MIN_VALUE;
                for (int j = 1; j < n; j++) {
                    prevDiff = Math.max(prevDiff,
                            profit[i - 1][j - 1] -
                                    prices[j - 1]);
                    profit[i][j] = Math.max(profit[i][j - 1],
                            prices[j] + prevDiff);
                }
            }

            return profit[k][n - 1];
        }
    }
}
