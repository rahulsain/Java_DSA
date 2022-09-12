package competition;

import java.util.Scanner;

public class StringDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long no = Long.parseLong(s);
        String ans = String.valueOf(no * 2);
        System.out.println(ans);
        sc.close();
    }
}
