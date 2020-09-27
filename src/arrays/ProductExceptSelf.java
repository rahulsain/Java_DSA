package arrays;

import java.util.Scanner;

public class ProductExceptSelf {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array");
int n = sc.nextInt();
int[] array = new int[n];
int[] newArray = new int[n];
System.out.println("enter the array");
for(int i = 0; i<n; i++) {
	array[i] = sc.nextInt();
}
for(int i = 0; i<n; i++) {
	newArray[i] = 1;
	for(int pos = 0; pos<n; pos++) {
	if(i==pos) {
		continue;}
	else {
	newArray[i] *=array[pos] ;}
}
}
for(int i = 0; i<n; i++) {
System.out.print(newArray[i] + " ");
}
sc.close();
	}
}
