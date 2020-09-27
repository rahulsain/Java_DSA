package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of rows and columns of 1st array");
	    int rows1 = sc.nextInt();
	    int cols1 = sc.nextInt();
	    System.out.println("Enter no of rows and columns of 2nd array");
	    int rows2 = sc.nextInt();
	    int cols2 = sc.nextInt();
	    int matrixOne[][] = new int[rows1][cols1];
	    int matrixTwo[][] = new int[rows2][cols2];
	    int matrixMultiplication[][] = new int[rows1][cols2];
	    if(rows2==cols1) {
	    System.out.println("enter elements of 1st array");
	    for(int i = 0; i<rows1; i++) {
	    	for(int j = 0; j<cols1; j++) {
	    		matrixOne[i][j] = sc.nextInt();
	    	}
	    }
	    System.out.println("enter elements of 2nd array");
	    for(int i = 0; i<rows2; i++) {
	    	for(int j = 0; j<cols2; j++) {
	    		matrixTwo[i][j] = sc.nextInt();
	    	}
	    }
	    for(int i = 0; i<rows1; i++) {
	    	for(int j = 0; j<cols2; j++) {
	    		matrixMultiplication[i][j] = 0;
	    		for(int k = 0; k<cols1; k++) {
                matrixMultiplication[i][j] += matrixOne[i][k] * matrixTwo[k][j];
	    		}
	    	}
	    	}
	    for(int i = 0; i<rows1; i++) {
	    	for(int j = 0; j<cols2; j++) {
	    	System.out.print(matrixMultiplication[i][j]+" ");
	    	}System.out.println();
	    }
	    }
	    else
	    	System.out.println("multiplication is not possible");
	    sc.close();
	}
}