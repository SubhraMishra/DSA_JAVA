package LinkedList;

public class Rotate_LL {
    public static Node<Integer> rotateRight(Node<Integer> head, int k) {
        if(head==null || head.next==null || k==0)
            return head;


        Node<Integer> cur=head;
        int length=1;
        while(cur.next!=null){
            cur=cur.next;
            length++;
        }

        k=k%length;
        k=length-k;
        cur.next=head;
        while(k>0){
            cur=cur.next;
            k--;

        }

        head=cur.next;
        cur.next=null;



        return head;


    }

    public static void main(String[] args) {
        Node<Integer> head=Node.takeInput();
        Node<Integer> h=rotateRight(head,2);
        Node.print(h);
    }

}
