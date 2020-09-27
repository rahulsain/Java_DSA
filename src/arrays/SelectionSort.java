package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("enter the array");
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i<n-1; i++) {
			int minEle = i;
			for(int j=i; j<n; j++) {
			if(array[j]<array[minEle]) {
				minEle = j;
			}
		} 
			int temp = array[minEle];
			array[minEle] = array[i];
			array[i] = temp;
		}
		for(int item: array)
			System.out.print(item + " ");
		sc.close(); 
	}

}
