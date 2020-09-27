package arrays;

import java.util.Scanner;

public class KthMinMax {

	public static void main(String[] args) {
		System.out.println("enter the kth number and size of array and the array");
		
		int size,minElement,maxElement;
		 Scanner sc = new Scanner(System.in);
		 int k =sc.nextInt();
		 size = sc.nextInt();
		int array[] = new int[size];
		for(int i = 0; i<size; i++ )
		 array[i] = sc.nextInt();
		if(k>size || k<0)
			System.out.println("please re-enter the kth element");
		else {
		minElement = k-1;
		maxElement = size-k;
		for(int i = 0; i<size-1; i++) {
			int minIndex = i;
			for(int j = i; j<size; j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
				}
				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
		System.out.println("maximum is "+array[maxElement]+" and minimun is "+array[minElement]);}
		sc.close();
	}

}
