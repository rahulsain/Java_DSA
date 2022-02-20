package competition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shuffledAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long k = 1; k < t + 1; k++) {


            //input

            String input = sc.next();

            //logic

            String ans = "";
            Map<String, Integer> data = new HashMap<>();


            printDistinctAnagram(input,"");

            //output
            System.out.println("Case #" + k + ": " + ans);
        }
        sc.close();
    }

    static void printDistinctAnagram(String str,
                                     String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            // print ans
            System.out.print(ans + " ");
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (!alpha[ch - 'a'])
                printDistinctAnagram(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

}
