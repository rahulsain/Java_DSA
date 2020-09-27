package loops;

import java.util.Scanner;

public class ForLoops {
 public static void main(String[] args) {
	 Scanner lp = new Scanner(System.in);
	 System.out.println("Enter the number you want to check factorial for");
	 int n=lp.nextInt(); int fact=1; int i=n;
	 while(i>0) {
		 fact= fact * i;
		 i--;
	 
 }
	 System.out.println("Factorial is "+ fact);
	 lp.close();
 }
}
