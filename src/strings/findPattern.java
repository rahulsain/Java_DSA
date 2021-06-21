package strings;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/find-pattern/1/?track=cip-java-arrays-string&batchId=238#
public class findPattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = 1;
//        sc.nextLine();
        while(t-- > 0){

            //taking the input String
            String s=sc.next();
            String p=sc.next();

            System.out.println(findPat(s,p));

        }
    }

    private static int findPat(String s, String p) {
        return s.indexOf(p);

    }
}
