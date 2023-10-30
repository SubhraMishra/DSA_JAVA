package LinkedList2;
import LinkedList.Node;
import java.util.Scanner;

public class InsertANode {

    public static void main(String args[]){
        Node a=new Node();
        Node<Integer> h=a.takeInput();
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        int number=s.nextInt();
        Node<Integer> headd=insert(h,pos,number);
        a.print(headd);
    }
    public static Node<Integer>  insert(Node<Integer> head,int pos,int num){
        if(pos==0){
            Node<Integer> newnum=new Node<Integer>(num);
            newnum.next=head;
            return newnum;
        }
        else{
            head.next=insert(head.next,pos-1,num);
            return head;
        }
    }
}
