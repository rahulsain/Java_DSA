package codeforces.greedy;

import java.util.Scanner;

public class kLCMEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n % 2 == 0 && (n / 2) % 2 == 0) {
                System.out.println(n / 2 + " " + n / 4 + " " + n / 4);
            } else if (n % 2 == 0 && (n / 2) % 2 == 1) {
                int c = n - 2;
                System.out.println(c / 2 + " " + c / 2 + " " + (n - c));
            } else {
                System.out.println(n / 2 + " " + n / 2 + " " + (n - (n / 2 + n / 2)));
            }
        }
    }
    // static int lcm(int x, int y){
    //     return ((x*y)/gcd(x,y));
    // }
    // static int gcd(int a, int b){
    //     if (b == 0)
    //         return a;
    //     return gcd(b, a % b);
    // }
}
