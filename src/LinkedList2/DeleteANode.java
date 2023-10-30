package LinkedList2;

import LinkedList.Node;

import java.util.Scanner;

public class DeleteANode {
    public static void main(String args[]){
        Node a=new Node();
        Node<Integer> h=a.takeInput();
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        Node<Integer> headd=delete(h,pos);
        a.print(headd);
    }
    public static Node<Integer> delete(Node<Integer> head,int pos){

        if(pos==0){
            return head.next;
        }
      else{
          head.next=delete(head.next,pos-1);
        }
      return head;
    }
}
