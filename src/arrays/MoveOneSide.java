package arrays;

import java.util.Scanner;

public class MoveOneSide {

	public static void main(String[] args) {
		System.out.println("enter the size of array and the array");
		int size;
//		int count1 = 0,ref = 0,count2=0;
		 Scanner sc = new Scanner(System.in);
		 size = sc.nextInt();
		int array[] = new int[size];
		for(int i = 0; i<size; i++ )
		 array[i] = sc.nextInt();
//		int[] negArr = new int[size],posArr = new int[size];
//		for(int i = 0; i<size; i++ ) {
//			if(array[i] < ref) {
//				negArr[count1++] = array[i];
//			}
//			else {
//				posArr[count2++] = array[i];
//			}
//		}
//		int[] arrayNew = new int[count1 + count2];
//		System.arraycopy(negArr, 0, arrayNew, 0, count1);
//		System.arraycopy(posArr, 0, arrayNew, count1, count2);
		for(int item: shiftAll(array,0,size-1))
			System.out.print(item + " ");
		sc.close();
	}
	// two pointer algorithm
	public static int[] shiftAll(int a[],int left,int right) {
		
		while(left <= right) {
			if(a[left] < 0 && a[right] < 0) {
				left++;
			}
			else if(a[left] >= 0 && a[right] < 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			else if(a[left] >= 0 && a[right] >= 0) {
				right--;
			}
			else {
				left++;
				right--;
			}
		}
		return a;
	}

}
