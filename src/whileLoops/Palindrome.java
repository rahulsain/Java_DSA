package whileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int pal=no,rem,rev=0;
		while(pal>0) {
			rem=pal%10;
			pal=pal/10;
			rev= rev*10+ rem;
		}
		if(rev==no)
			System.out.println("no is palindrome");
		else
			System.out.println("try again");
		sc.close();
	}

}
