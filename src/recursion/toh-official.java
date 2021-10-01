import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        
        toh(n,n1,n2,n3);
        
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        
        if(n==0)
        {
         return;
        }
        
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n + "["+ t1id +" -> " + t2id + "]");
        toh(n-1,t3id,t2id,t1id);
        
    }

}