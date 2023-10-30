package LinkedList;
import java.util.Scanner;


public class InsertANode {
    public static void main(String args[]){
        Node a=new Node();
        Node<Integer> h=a.takeInput();
        Scanner c=new Scanner(System.in);
        int number=c.nextInt();
        int position=c.nextInt();
        Node<Integer> head=insert(h,number,position);
        print(head);



    }
    public static Node<Integer> insert(Node<Integer> head,int num,int pos){

        Node<Integer> NodeToBeInserted=new Node<Integer>(num);
        Node<Integer> prev=head;
        int count=0;

        if(pos==0){
          NodeToBeInserted.next=head;
          return NodeToBeInserted;
        }
        else{
            if(count<pos-1 && prev!=null)
            {
                count++;
                prev=prev.next;
            }

            if(prev!=null){
                NodeToBeInserted.next=prev.next;
                prev.next=NodeToBeInserted;
            }
        }
        return head;

    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
