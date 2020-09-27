package loops;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
				for(int i=1; i<=n-1; i++) {
					System.out.print("  ");}
				
				System.out.println("*");
                    if(n>1) {
                    	
					for(int l = 2; l<=n-1; l++) {
						for(int i=1;i<=n-l;i++) {
                    		System.out.print("  ");}
						System.out.print("* ");
						for(int j=1; j<=l-2; j++) {
							System.out.print("  ");
						}
						System.out.print("*");
						System.out.println();}
		
					for(int k=1; k<=n; k++) {
						System.out.print("* ");
					}
				}
                    
				
			
		sc.close();
}
}
