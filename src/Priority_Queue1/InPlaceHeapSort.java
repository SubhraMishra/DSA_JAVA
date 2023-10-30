package Priority_Queue1;

public class InPlaceHeapSort {
    public static void downHeapify(int arr[],int i,int n){
      int parentIndex=i;
      int leftChildIndex=2*i+1;
      int rightChildIndex=2*i+2;

      while(leftChildIndex<n){
          int minIndex=parentIndex;
          if(arr[leftChildIndex]<arr[minIndex]){
              minIndex=leftChildIndex;
          }
          if(rightChildIndex<n && (arr[rightChildIndex]<arr[minIndex])){
              minIndex=rightChildIndex;
          }
          if(parentIndex==minIndex)
              return;

          int temp=arr[parentIndex];
          arr[parentIndex]=arr[minIndex];
          arr[minIndex]=temp;
          parentIndex=parentIndex;
          leftChildIndex=2*parentIndex+1;
          rightChildIndex=2*parentIndex+2;
      }
    }
    public static void heapSort(int arr[]){
        //build the heap
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--)
        {
            downHeapify(arr,i,n);
        }
        //Remove elements from starting one by one,put them in their respective last position
        for(int i=n-1;i>=0;i--){
        int temp=arr[i];
        arr[i]=arr[0];
        arr[0]=temp;
        downHeapify(arr,0,i);
        }

    }


    public static void main(String args[]){
        int arr[]={4,7,3,2,8,9,6,1};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
