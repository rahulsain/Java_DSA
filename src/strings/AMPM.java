package strings;

import java.util.Scanner;

public class AMPM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        String[] temp = time.split(":");
        int hour = Integer.parseInt(temp[0]);
        if (hour > 11)
            System.out.println("PM");
        else
            System.out.println("AM");
        sc.close();
    }
}
