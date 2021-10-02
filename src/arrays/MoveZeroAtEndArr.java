import java.util.*;
class MoveZeroAtEndArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements in array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=0;
        int temp=0;
        while(i<n){
            if(arr[i]==0){
                i++;
            }
            else{
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j++;
            }
        }    
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    
}
}
