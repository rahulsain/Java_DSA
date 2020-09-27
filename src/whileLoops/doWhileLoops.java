package whileLoops;

import java.util.Scanner;

public class doWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no;
		do {
			no = sc.nextInt();
			System.out.println("number is "+no);
		}while(no != 0);
		sc.close();
	}

}
