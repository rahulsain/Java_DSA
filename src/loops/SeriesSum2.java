package loops;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int no=sc.nextInt();
float result = 0;
for(float i =1; i<=no; i++) {
	if(i % 2 != 0)
	result += 1/i;
	else 
		result -= 1/i;

}
System.out.println(result);
sc.close();
	}

}
