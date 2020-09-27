package arrays;

import java.util.Scanner;

public class OccuranceOfNo {

	public static void main(String[] args) {
		System.out.println("enter the kth number and size of array and the array");
		int size,count = 0;
		 Scanner sc = new Scanner(System.in);
		 int n =sc.nextInt();
		 size = sc.nextInt();
		int array[] = new int[size];
		for(int i = 0; i<size; i++ )
		 array[i] = sc.nextInt();
		for(int i = 0; i<size; i++ ) {
			if(array[i] == n)
				count++;
		}
		System.out.println("occurance of "+n+" number is = "+count);
		sc.close();
	}

}
