package loops;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k=n-1,v=n;
for(int i = 1; i<=n; i++) {
	
	for(int j = 1; j<=n-i; j++) {
		System.out.print("  ");
	}
	for(int j = 1; j<=2*i-1; j++) {
		if(j==i) {
			System.out.print("0 ");
		k=n-1;
		}
		else if(j<i) {
		System.out.print(v++ +" ");
	          }
		else {
			System.out.print(k-- +" ");}
	} v=n-i ;
System.out.println();
}sc.close();
	}
}
