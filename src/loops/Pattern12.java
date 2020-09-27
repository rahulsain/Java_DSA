package loops;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rows=2*n+1;
		for(int i=1; i<=rows; i++) {
			if(i<=n) {
			for(int j=n; j>=i; j--) {
				System.out.print("* ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("  ");
			}
			for(int l=n; l>=i; l--) {
				System.out.print("* ");
			}
			}
			else {
				for(int j=1; j<=i-n-1; j++) {
					System.out.print("* ");
				}
				for(int k=1; k<=rows-2*(i-n-1);k++) {
					System.out.print("  ");
				}
				for(int l=1 ; l<=i-n-1; l++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}sc.close();
	}

}
