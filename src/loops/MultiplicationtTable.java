package loops;

public class MultiplicationtTable {
public static void main(String[] args) {
	int res=0;
	for(int i=1;i<=20;i++) {
		for(int j=1;j<=10;j++) {
			res=i*j;
			System.out.println(i+" * "+j+" = "+res+" ");
		}System.out.println();
	}
}
}
