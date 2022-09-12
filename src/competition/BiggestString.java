package competition;

public class BiggestString {
    public static void main(String[] args) {
        String s = "abAba";
        char k = 'c';

        System.out.println(BiggestStringFormer(s, k));
    }

    static String BiggestStringFormer(String s, char k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < k) {
                String temp = s;
                s = s.substring(0, i);
                s += k;
                s += temp.substring(i);
                return s;
            }
        }
        s += k;

        return s;
    }

    // partially accepted
}
