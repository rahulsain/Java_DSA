package arrays;

import java.util.Scanner;

public class matrixAddtion {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows and columns");
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int matrixOne[][] = new int[rows][cols];
    int matrixTwo[][] = new int[rows][cols];
    int matrixSum[][] = new int[rows][cols];
    System.out.println("enter elements of 1st array");
    for(int i = 0; i<rows; i++) {
    	for(int j = 0; j<cols; j++) {
    		matrixOne[i][j] = sc.nextInt();
    	}
    }
    System.out.println("enter elements of 2nd array");
    for(int i = 0; i<rows; i++) {
    	for(int j = 0; j<cols; j++) {
    		matrixTwo[i][j] = sc.nextInt();
    	}
    }
    System.out.println("sum of the matrix is");
    for(int i = 0; i<rows; i++) {
    	for(int j = 0; j<cols; j++) {
    	matrixSum[i][j]	= matrixOne[i][j] + matrixTwo[i][j];
    	}
    }
    
    for(int i = 0; i<rows; i++) {
    	for(int j = 0; j<cols; j++) {
    	System.out.print(matrixSum[i][j]);
    	}System.out.println();
    }
    sc.close();

	}

}
