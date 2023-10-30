package LinkedList2;
import LinkedList.Node;
import java.util.Scanner;

public class FindANodeInLL_Recursive {
    public static void main(String args[]){
        Node a=new Node();
        Node<Integer> head=a.takeInput();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int output=findNode(head,n);
        System.out.println(output);

    }
    static int count=0;
    public static int findNode(Node<Integer> head,int n){
      if(head==null){
          return -1;
      }
      if(head.data==n){
          return count;
      }
      count++;
      return findNode(head.next,n);



    }
}
