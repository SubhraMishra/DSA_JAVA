package LinkedList;
import java.util.Scanner;


public class  Node<T> {
    public T data;
    public Node next;
    public Node child;

    public Node(T data) {
        this.data = data;
    }
//This false constructor has been created to create an object in other class
    public Node() {

    }


    public static Node<Integer> CreateLL() {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        return n1;


    }

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();

    }
    static int count=0;
    public static int length(Node<Integer> head){
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String args[]){
  //      Node<Integer> l=CreateLL();
        Node<Integer> l=takeInput();
       print(l);
     System.out.print(length(l));

    }
    //Taking input from user of LL

    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null,tail=null;
        while(data!=-1) {
            Node<Integer> currentNode=new Node<Integer>(data);

            if (head == null) {
                head=currentNode;
                tail=currentNode;
            }
            else{
                tail.next=currentNode;
                tail=currentNode;

            }
            data=s.nextInt();
        }
        return head;
    }



}

