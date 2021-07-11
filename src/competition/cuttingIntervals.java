package competition;

import java.util.ArrayList;
import java.util.Scanner;

public class cuttingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long k = 1; k < t + 1; k++) {
            //input
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[][] a = new long[n][2];
            int ans = n;
            long cut = c;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = sc.nextInt();
                }
            }


            //logic
            ArrayList<Long> temp = new ArrayList<>();

            for (int i = 0; i < n && cut > 0; i++) {
                long middle = (a[i][0] + a[i][1]) / 2;
                if (temp.contains(middle)) {
                    continue;
                }
                temp.add(middle);
                ans += calculate(a, middle);
                cut--;
            }

            //output
            System.out.println("Case #" + k + ": " + ans);
        }
        sc.close();
    }

    static int calculate(long[][] a, long middle) {

        int ans = 0;

        for (long[] longs : a) {
            long low = longs[0];
            long high = longs[1];
            if (low < middle && high > middle) {
                ans++;
            }
        }

        return ans;
    }
}
