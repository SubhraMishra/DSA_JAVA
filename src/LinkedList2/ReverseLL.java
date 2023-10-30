package LinkedList2;

import LinkedList.Node;

import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) {
        Node a=new Node();
        Node<Integer> h=a.takeInput();
        Node<Integer> headd=Reverse(h);
        a.print(headd);
    }
    public static Node<Integer> Reverse(Node<Integer> head){

        if(head==null){
            return head;
        }
        if(head.next==null)
            return head;
        Node<Integer> smallHead=Reverse(head.next);
        Node<Integer> tail=head.next;
        tail.next=head;
        head.next=null;
        return smallHead;

    }
}
