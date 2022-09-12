package competition;

public class SumString {
    public static void main(String[] args) {
        String num1 = "242";
        String num2 = "921";

        System.out.println(SumString(num1, num2));
    }

    static String SumString(String no1, String no2) {
        String sum = "0";

//        int no1

        return sum;
    }

    public static int convert(String s) {
        int num = 0;
        int n = s.length();

        for (int i = 0; i < n; i++)
            num = num * 10 + ((int) s.charAt(i) - 48);

        return num;
    }
}
