package competition;

import java.util.Scanner;

class Solution
{//retype kickstart
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for(long i = 1; i<t+1; i++) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			long s = sc.nextLong();
			long y = 0;
			
			long minTillNow = k-1;
			long restartZero = n+1;
			
			long restartGame = minTillNow + restartZero;
			
			long backward = k-s;
			long remaining = n-s+1;
			
			long totalBack = backward + remaining + minTillNow;
			
			y = Math.min(totalBack, restartGame);
			
			
			
			System.out.println("Case #"+i+": "+y);
		}
		sc.close();
	}
}
