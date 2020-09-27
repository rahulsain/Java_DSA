package arrays;

import java.util.Scanner;

public class RangeOfArray {

	public static void main(String[] args) {


		
			System.out.println("enter the size of array");
			int size,minElement=1000000000,maxElement = -1000000000;
			 Scanner sc = new Scanner(System.in);
			 size = sc.nextInt();
			int array[] = new int[size];
			for(int i = 0; i<size; i++ )
			 array[i] = sc.nextInt();
			for(int i = 0; i<size; i++) {
				if(array[i]>maxElement)
					maxElement = array[i];
				if(array[i]<minElement)
					minElement = array[i];
			}
			System.out.println("maximum is "+maxElement+" and minimun is "+minElement);
			int range = maxElement - minElement;
			System.out.println("range is = "+range);
			sc.close();
		


	}

}
