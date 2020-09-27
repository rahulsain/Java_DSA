package oops;

public class ExceptionHandling {

	public static void main(String[] args) {
		fun1();
		try {
			fun4();}
			catch(ArrayIndexOutOfBoundsException p) {
				System.out.println(p.getMessage()+ " can you fix it>?");
			}
			finally {
				System.out.println("no on can beat me");
			}
	}
	public static void fun1() {
		int a = 7,b = 3;
		int c = a/b;
		System.out.println(c);
		fun2();
		
	}
	public static void fun2() {
		int a = 7,b = 0;
		try {
		int c = a/b;
		System.out.println(c);
		
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" occured please try agian");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" array size is exceeded");
		}
		finally {
			System.out.println("i can handle any exception");
		}
		System.out.println("this is an important task");
		System.out.printf("prinf %n  %dhappy now ",b);
		try {
		fun3();}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" occured please try agian");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" array size is exceeded");
		}
		
		
	}
	public static void fun3() throws ArrayIndexOutOfBoundsException {
		int a[] = new int[3];
		System.out.println(a[3]);
		
		
	}
	public static void fun4() throws ArrayIndexOutOfBoundsException {
		
		
	boolean isDanger = true;
	if(isDanger)
		throw new ArrayIndexOutOfBoundsException("danger was coming");}
}
