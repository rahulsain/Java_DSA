package loops;
import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int no = sc.nextInt();
	boolean isPrime= true;
	if(no<2) isPrime = false;
	for(int i= 2; i * 1<no; i++) {
		if(no % i == 0) {
			isPrime = false;
			break;
		}
	}
	System.out.println("prime is "+isPrime);
	sc.close();
}
}
