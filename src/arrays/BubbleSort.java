package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int temp;
		int[] array = new int[n];
		System.out.println("enter the array");
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i<n-1; i++) {
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
			if(array[j]>array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				sorted = false;
			}
		} if(sorted) break;
		}
		for(int item: array)
			System.out.print(item + " ");
		sc.close();
	}

}
