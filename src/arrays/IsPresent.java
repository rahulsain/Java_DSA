package arrays;

public class IsPresent {
	
		int num,size;
		int arr[] = new int[size];
		IsPresent(){
			System.out.println("i m default");
		}
		IsPresent(int n,int m,int a[]){
			num = n;
			size = m;
//			for(int i = 0;i<size; i++) {
			arr = a;
//			}
		}
		
		 boolean IsPresentNot() {
			boolean isPresent = false;
			for(int i = 0;i<size; i++) {
				if(arr[i]==num)
					isPresent = true;
				
				}
			return isPresent;
		}
		void display() {
			System.out.println(num+" no and size is "+size+"and array is"+arr);
		}
	}

