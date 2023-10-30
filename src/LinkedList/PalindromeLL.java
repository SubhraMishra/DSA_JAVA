package LinkedList;


public class PalindromeLL {

    public static void main(String args[]){

        Node a=new Node();
        Node<Integer> h=a.takeInput();
        boolean ans=Palindrome(h);
        System.out.print(ans);
    }
    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> fast=head,slow=head;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public static boolean Palindrome(Node<Integer> head){
        ReverseLinkedList r=new ReverseLinkedList();
        Node<Integer> head1=head;
        Node<Integer> mid=midpoint(head);
        Node<Integer> head2=r.ReverseLL(mid.next);


        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                head1=head1.next;
                head2=head2.next;
            }
            else{
                return false;
            }

        }

        return true;
    }

}
