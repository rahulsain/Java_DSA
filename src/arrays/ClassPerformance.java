package arrays;
import java.util.Scanner;

public class ClassPerformance {

	public static void main(String[] args) {
		Scanner cp = new Scanner(System.in);
		System.out.println("Enter the number of student data you want to store: ");
		int n = cp.nextInt();
		int[] rollNumber = new int[n];
		String[] name = new String[n];
		float[] percentage = new float[n];
		System.out.println("Enter total number of subjects: ");
		int no = cp.nextInt();
		float marks[][] = new float[n][no];
		System.out.println("Enter the name of "+n+" students: ");
		for(int i = 0; i<n; i++) {
			name[i]=cp.next();
		}
		System.out.println("Enter the roll number of "+n+" students: ");
		for(int i = 0; i<n; i++) {
			rollNumber[i]=cp.nextInt();
		}
		System.out.println("Enter the marks of "+n+" students of "+no+" subjects: ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<no; j++) {
				marks[i][j] = cp.nextFloat();
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<no; j++) {
				percentage[i] += marks[i][j];
			}
			percentage[i] /= no; 
		}
		float maximumPercentage = 0,temp;
		int position = 0;
		for(int i = 0; i<n; i++) {
			temp = percentage[i];
			if(temp >= maximumPercentage) {
				maximumPercentage = temp;
				position = i;
			}
		}
		System.out.println("The class topper is "+ name[position]+" roll no "+ rollNumber[position]+" with a percentage of "+ maximumPercentage+" in "+no+" subjects out of "+n+" number of students in his class. YAY!!");
		
        cp.close();
	}

}
