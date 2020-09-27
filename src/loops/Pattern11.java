package loops;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i< 2*n; i++) {
			if(i<=n) {
			for(int j=n-1; j>=i; j--) { 
				System.out.print("  ");}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			}
			else {
				for(int k =1; k<=i-n;k++) {
					System.out.print("  ");
				}
			for(int j=1; j<=2*n-i; j++) {
			System.out.print("* ");}}
			System.out.println(); 
			}
		sc.close();
	}

}
