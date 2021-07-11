package competition;

import java.util.Scanner;

public class arithmeticSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long k = 1; k < t + 1; k++) {
            long[][] a = new long[3][3];
            int ans = 0;
            //input

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    a[i][j] = sc.nextInt();
                }
            }


            //logic

            a[1][1] = ((a[1][0] + a[1][2]) / 2);
            int test = calculate(a);
            if (test > ans)
                ans = test;

            a[1][1] = ((a[0][1] + a[2][1]) / 2);
            test = calculate(a);
            if (test > ans)
                ans = test;

            a[1][1] = ((a[0][0] + a[2][2]) / 2);
            test = calculate(a);
            if (test > ans)
                ans = test;

            a[1][1] = ((a[0][2] + a[2][0]) / 2);
            test = calculate(a);
            if (test > ans)
                ans = test;

            //output
            System.out.println("Case #" + k + ": " + ans);
        }
        sc.close();
    }

    static int calculate(long[][] a) {
        int count = 0;

        //rows
        if ((a[0][1] - a[0][0]) == (a[0][2] - a[0][1]))
            count++;
        if ((a[1][1] - a[1][0]) == (a[1][2] - a[1][1]))
            count++;
        if ((a[2][1] - a[2][0]) == (a[2][2] - a[2][1]))
            count++;


        //columns
        if ((a[1][0] - a[0][0]) == (a[2][0] - a[1][0]))
            count++;
        if ((a[1][1] - a[0][1]) == (a[2][1] - a[1][1]))
            count++;
        if ((a[1][2] - a[0][2]) == (a[2][2] - a[1][2]))
            count++;

        //diagonals
        if ((a[1][1] - a[0][0]) == (a[2][2] - a[1][1]))
            count++;
        if ((a[1][1] - a[0][2]) == (a[2][0] - a[1][1]))
            count++;

        return count;
    }
}
