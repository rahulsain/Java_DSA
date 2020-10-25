package maths;

import java.util.Arrays;

public class MathematicsforCP {

	public static void main(String[] args) {
		
//		boolean isPrime[] = seiveOfEratosSthenes(20);
//		
//		for(int i = 0; i<=20; i++) {
//			System.out.println(i+" "+isPrime[i]); 
//		}
//		
//		System.out.println(gcd(20,120));
		
		System.out.println(fastPower(393932342, 523232232,1000000000));
	}
	
	static long fastPower(long a,long b,int n) {
		
		long result = 1;
		
		while(b > 0) {
			if((b&1) != 0) {
				result = (result * a % n) % n;
			}
			a = (a % n *a % n) % n;
			b = b>>1;
		}
		
		return result;
	}
	
	
	static int gcd(int a,int b) {
		if(b == 0)
			return a;
		
		return gcd(b,a%b); 
		// return a % b == 0 ? b : gcd(b,a%b); 
	}
	
	static boolean[] seiveOfEratosSthenes(int n) {
		
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i = 2; i*i<=n; i++) {
			
			for(int j = 2*i; j<=n; j+= i) {
				isPrime[j] = false;
			}
		}
	
	
	
	
	return isPrime;
	}

}
