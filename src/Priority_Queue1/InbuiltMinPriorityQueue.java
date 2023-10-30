package Priority_Queue1;

import java.util.PriorityQueue;

public class InbuiltMinPriorityQueue {

    public static void main(String args[]){
        int[] arr={4,5,8,7,9,3,2,1,6};
        PriorityQueue pq=new PriorityQueue();
        for(int i=0;i<arr.length;i++){
            if(pq.add(arr[i]));
        }
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
