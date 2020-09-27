package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int no = sc.nextInt(),rem,sum=0,n=no;
while(n>0) {
	rem = n%10;
	n= n/10;
	sum+=rem;
}
System.out.println("sum of the number is "+sum);
int noOfDigits= (int) Math.log10(no)+1;
System.out.println("no of digits in "+no+" is "+noOfDigits);
sc.close();
	}

}
