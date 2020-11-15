package arrays;
import java.util.*;
//import java.lang.*;
import java.io.*;

public class unionIntersection {

			public static void main (String[] args) throws IOException
			 {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 int test = Integer.parseInt(br.readLine());
			 while(test-- >0){
			    String[] temp = br.readLine().split(" ");
			 	int n = Integer.parseInt(temp[0]);
			 	int m = Integer.parseInt(temp[1]);
			 	temp = br.readLine().split(" ");
			 	int a1[] = new int[n];
			 	int a2[] = new int[m];
			 	int[] ans = new int[m+n];
			 	for(int i = 0; i<n; i++){
			 	    a1[i] = Integer.parseInt(temp[i]);
			 	}
			 	temp = br.readLine().split(" ");    
			 	for(int i = 0; i<m; i++){
			 	    a2[i] = Integer.parseInt(temp[i]);       
			 	}
			 		int k = 0;
			 		Arrays.sort(a1);
			 		Arrays.sort(a2);
			 		for(int i = 0; i<n; i++){
			 			if(i < n-1) {
			 			if(a1[i] == a1[i + 1])
			 				continue;
			 			}
			 	        if(!(binarySearch(ans,0,k,a1[i]))){
			 	           ans[k++] = a1[i]; 
			 	        }
			 	    }
			 	    for(int i = 0; i<m; i++){
			 	    	if(i < m-1) {
			 	    	if(a2[i] == a2[i + 1])
			 				continue;
			 	    	}
			 	        if(!(binarySearch(ans,0,k,a2[i]))){
			 	        	ans[k++] = a2[i];
			 	        }
			 	    }
			 	    System.out.println(k);
			 }
			 br.close();
			 }
			
		public static boolean binarySearch(int[] a,int left,int right,int key) {
			if(left<= right) {
				int mid = (left + right) / 2;
				if(a[mid] == key) {
					return true;
				}
				else if(a[mid] > key) {
					return binarySearch(a, left, mid - 1, key);
				}
				else {
					return binarySearch(a, mid + 1, right, key);
				}
			}
			return false;
			
		}
		
		public static int[] SelectionSort(int array[],int n) {
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
				return array;
			}
}


