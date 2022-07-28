//this is first commit, "with no repetition", where left part is highlight
//this is second commit, "with no repetition", where left part is highlight and highlighted is not changed
//this is third commit, "with repetition", where left part is highlight and highlighted is not changed
//this is fourth commit, "with repetition", where left part is highlight and highlighted is changed

package strings;

import java.util.Scanner;

class consonantVowelCheck {

    public static void main(String[] args) {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //taking total count of all testcases
        int t = 1;
//        sc.nextLine();
        while(t-- > 0){

            //taking the input String
            String s=sc.nextLine();

            checkString(s);

        }
    }

    public static void checkString(String s) {
        int v=0;
        int c=0;

        s = s.replaceAll("\\s", "");

        for (char ch: s.toCharArray()) {
            switch (ch){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    v++;
                    break;
                default:
                    c++;
                    break;
            }
        }

        if(v>c)
            System.out.print("Yes");
        else if(c>v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}



