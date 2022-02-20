package competition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DogsNCats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long k = 1; k < t + 1; k++) {

            //input
            int n,d,c,m;

            n = sc.nextInt();
            d = sc.nextInt();
            c = sc.nextInt();
            m = sc.nextInt();

            String arrangement = sc.next();

            //logic

            String ans = "YES";

            for(int i = 0; i < arrangement.length(); i++){
                char ch = arrangement.charAt(i);


                if(ch == 'D'){
                    if(d == 0){
                        ans = "NO";
                    }
                    c += m;
                    d--;
                } else {
                    if(c == 0 && arrangement.substring(i).contains("D")){
                        ans = "NO";
                    }
                    c--;
                }
            }

            //output
            System.out.println("Case #" + k + ": " + ans);
        }
        sc.close();
    }
}
