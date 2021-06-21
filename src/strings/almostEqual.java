package strings;

//https://practice.geeksforgeeks.org/problems/almost-equal-java/1/?track=cip-java-arrays-string&batchId=238#

import java.util.*;
import java.lang.*;

class almostEqual
{

    public static void main (String[] args)
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking total number of testcases
        int t = 1;

        while(t-- > 0){

            //taking the 2 strings
            String s1=sc.next();
            String s2=sc.next();

            System.out.println(countChars(s1,s2));

        }
    }
    public static int countChars(String s1, String s2)
    {

        int[] chars = new int[26];
        for (char c1 : s1.toCharArray()) { chars[c1-97]++; }
        for (char c2 : s2.toCharArray()) { chars[c2-97]--; }
        int count = 0;
        for(int i: chars) {count += Math.abs(i);}

        return count;

//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//
//        int[] count = new int[256];
//
//        int size = Math.min(ch1.length,ch2.length);
//        int ans = 0;
//        int i = 0, j = 0;
//        while(i<size){
//            count[ch1[i] - 'a']++;
//            count[ch2[i++] - 'a']--;
//        }
//        while(j < 256){
//            if(count[j] != 0){
//                ans+= Math.abs(count[j]);
//            }
//            j++;
//        }
//        ans += Math.max(ch1.length,ch2.length) - i;
//        return ans;
    }
}
