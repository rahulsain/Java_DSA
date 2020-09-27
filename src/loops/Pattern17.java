package loops;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][] arr = new int[n+1][n+1];  
for(int i = 1; i<=n; i++) {
	for(int j = 1; j<=n-i; j++) {
		System.out.print("  ");
	}
	for(int j = 1; j<=i; j++) {
		if(j==1 || j==i) {
	        arr[i-1][j-1] = 1; 
		}else {
			arr[i-1][j-1] = arr[i-2][j-2] + arr[i-2][j-1];} 
		    System.out.print(arr[i-1][j-1]+"   ");
	}System.out.println();
}
sc.close();
	}

}
