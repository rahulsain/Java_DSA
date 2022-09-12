package competition;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = (int) Math.sqrt(n);
        int max = min + 1;
        int floor = min * min;
        int ceil = max * max;
        int minDiff = n - floor;
        int maxDiff = ceil - n;
        System.out.println(Math.min(minDiff, maxDiff));
        sc.close();
    }
}
