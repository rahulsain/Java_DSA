package typecasting;
import java.util.Scanner;

public class TypeCast {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		byte x=102;
		
		char y= (char)x;
		char z = sc.next().charAt(2); 	
		System.out.println(z);
		 double algoRyt=(double) z;
		System.out.println("algo="+algoRyt+"y="+y);
		
		
		sc.close();
	}

}
