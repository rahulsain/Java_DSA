package arrays;

import java.util.Scanner;



public class NumberPresent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		System.out.println("enter the array");
		int array[] = new int[size];
		for(int i = 0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		boolean present;
		IsPresent h = new IsPresent(no,size,array);
		present = h.IsPresentNot();
		System.out.println(present);
//		h.display();
		sc.close();
	}

}
