package arrays;

import java.util.Scanner;

public class MoveOneSide {

	public static void main(String[] args) {
		System.out.println("enter the size of array and the array");
		int size,count1 = 0,ref = 0,count2=0;
		 Scanner sc = new Scanner(System.in);
		 size = sc.nextInt();
		int array[] = new int[size];
		for(int i = 0; i<size; i++ )
		 array[i] = sc.nextInt();
		int[] negArr = new int[size],posArr = new int[size];
		for(int i = 0; i<size; i++ ) {
			if(array[i] < ref) {
				negArr[count1++] = array[i];
			}
			else {
				posArr[count2++] = array[i];
			}
		}
		int[] arrayNew = new int[count1 + count2];
		System.arraycopy(negArr, 0, arrayNew, 0, count1);
		System.arraycopy(posArr, 0, arrayNew, count1, count2);
		for(int item: arrayNew)
			System.out.print(item + " ");
		sc.close();
	}

}
