package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner fp = new Scanner(System.in);
  int no = fp.nextInt();
  int a = 0 ;
  int b = 1 ;
  int sum = 0;
  System.out.print(a + " "+ b + " ");
  while(no-2>0) {
	  sum = a + b ;
	  System.out.print(sum + " ");
	  a = b ;
	  b = sum ;
	  no--;
  }
  fp.close();
	}

}
