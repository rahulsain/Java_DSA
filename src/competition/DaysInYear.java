package competition;

import java.util.Scanner;

public class DaysInYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();
        String[] temp = null;
        if (date.contains("-")) {
            temp = date.split("-");
        } else if (date.contains("/")) {
            temp = date.split("/");
        }
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int days = Integer.parseInt(temp[2]);
        int countOfDays = 0;

        for (int monthCount = 1; monthCount < month; monthCount++) {
            countOfDays += getDaysInMonth(year, monthCount);
        }

        countOfDays += days;

        System.out.println(countOfDays * 10);
    }

    static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    return 29;
                else
                    return 28;
        }
        return 0;
    }
}
