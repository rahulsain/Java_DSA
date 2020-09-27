package arrays;

import java.util.Scanner;

public class NoSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		boolean contain012 = false;
		System.out.println("enter the array");
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
			contain012 = false;
			if(array[i] == 0 || array[i] == 1 || array[i] == 2) {
				contain012 = true;}
			else
				break;
		}
		if(contain012) {
			int[] newArray = new int[n];
			int hasZero = 0,hasOne = 0,hasTwo = 0;
			for(int i = 0; i<n; i++) {
				
				if(array[i] == 0)
					hasZero++;
				else if(array[i] == 1)
					hasOne++;
				else
					hasTwo++;
				
			}
			int i = 0;
			for(int j = 0; j<hasZero; j++) {
				newArray[i++] = 0;
			}
			for(int j = 0; j<hasOne;j++ ) {
				newArray[i++] = 1;
			}
			for(int j = 0; j<hasTwo;j++ ) {
				newArray[i++] = 2;
			}
			for(int item: newArray)
				System.out.print(item + " ");
		}
		else
			System.out.println("it doesnt contain 0 1 2 digits only");
		sc.close();
	}

}
