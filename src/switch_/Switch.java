package switch_;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the function you want to perform!");
		char c = sc.next(".").charAt(0);
		switch(c) {
		case '/':
			System.out.println("Divide "+10/2);
		case '*':
			System.out.println("multiply "+10*2);
			break;
		case '+':
			System.out.println("addition "+10+2);
		case '-':
			System.out.println("subtraction "+(10-2));
			break;
			default: 
				System.out.println("Pleas etry again");
			
		}
		sc.close();
	}

}
