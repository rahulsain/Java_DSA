package sorting;

class MergeSort{

    void sort(int arr[],int init,int last){
        if(init<last){
            int mid=(init+last)/2;
            sort(arr, init, mid);
            sort(arr, mid+1, last);
            merge(arr,init,mid,last);
        }
    }

    void merge(int a[],int init,int mid,int last){
        int i=init;
        int j=mid+1;
        int k=init;
        int b[]=new int[last+1];

        while(i<=mid && j<=last){
            if(a[i]<a[j]){
               b[k]=a[i];
               i++;
            }else {
                b[k]=b[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=last){
                b[k]=a[j];
                j++;k++;
            }
        }else  {
           while(i<=mid){
               b[k]=a[i];
               i++;k++;
           }
       }

       for(int m=init;m<last;m++){
           a[m]=b[m];
       }
    }
   public static void main(String args[]){
      int arraygiven[]={2,4,3,8,9,10};
      MergeSort merg=new MergeSort();
      merg.sort(arraygiven,0,5);
      System.out.println("done");
      for(int i=0;i<6;i++){
          System.out.print(arraygiven[i]+" ");
      }
   }
}
