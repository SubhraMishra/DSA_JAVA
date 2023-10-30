package LinkedList2;
import LinkedList.Node;

public class printReverseLLusingRecursion {
    public static void main(String args[]){
        Node a=new Node();
        Node<Integer> h=a.takeInput();
        print(h);

    }
    public static void print(Node<Integer> head){
        if(head==null){
            return;
        }
        print(head.next);
        System.out.print(head.data+" ");
    }
}
