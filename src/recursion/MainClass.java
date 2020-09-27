package recursion;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(path(353,824));
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	
	static int pwr(int a,int b) {
		if(b==0)
			return 1;
		return pwr(a,b-1)*a;
	}
	
	static int fastpwr(int a,int b) {
		if(b==0) {
			return 1;}
		 if(b % 2 == 0) {
		return fastpwr(a*a,b/2);}
		 return fastpwr(a,b-1)*a;
	}
	static int path(int n, int m) {
		if(m == 1 || n == 1) {
			return 1;
		}
		return path(n,m-1)+path(n-1,m);
	}
}
