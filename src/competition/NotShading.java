package competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NotShading {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        long t = fs.nextLong();
        for (long k = 1; k < t + 1; k++) {

            //input
            int n,c,r,m;

            n = fs.nextInt();
            r = fs.nextInt();
            c = fs.nextInt();
            m = fs.nextInt();

            String[][] a = new String[n][m];

            //logic

            for(int i=0;i<n;++i){
                String[] temp = fs.nextLine().trim().split("");
                if (m >= 0) System.arraycopy(temp, 0, a[i], 0, m-1);
            }

            boolean isCheck = false, isCheck1 = false;

            if(a[r-1][c-1].equals("B")){
                System.out.println("0");
                break;
            }

            for(int i=0;i<n;++i){
                for(int j=0;j<m;++j){
                    if (a[i][j].equals("B")) {
                        isCheck = true;
                        break;
                    }
                }
            }

            if(!isCheck){
                System.out.println("-1");
            }


            for(int i=0;i<n;++i){
                for(int j=0;j<m;++j){
                    if(i==r || j==c){
                        if(a[i][j].equals("B") && !isCheck1){
                            System.out.println("1");
                            isCheck1 = true;
                            break;
                        }
                    };
                }
            }



            if(!isCheck1){
                System.out.println("2");
            }







        }
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int [] readintarray(int n) {
            int res [] = new int [n];
            for(int i = 0; i<n; i++)res[i] = nextInt();
            return res;
        }

        long [] readlongarray(int n) {
            long res [] = new long [n];
            for(int i = 0; i<n; i++)res[i] = nextLong();
            return res;
        }
    }
}
