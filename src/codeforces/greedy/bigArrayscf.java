package codeforces.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bigArrayscf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(findAvgDel(arr, n));
        }

        sc.close();
    }

    private static int findAvgDel(ArrayList<Integer> a, int n) {
        int ans = 0;
        Collections.sort(a);
        int temp = n;
        while (temp-- > 0) {
            int avg = (a.get(0) + a.get(a.size() - 1)) / 2;

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > avg) {
                    a.remove(i);
                    ans++;
                }

            }
        }

        return ans;
    }
}
