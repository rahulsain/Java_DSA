package loops;
import java.util.Scanner;
public class SeriesSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int no=sc.nextInt();
float result = 0;
for(float i =1; i<=no; i++) {
	result += 1/i; 
}
System.out.println(result);
sc.close();
	}

}
