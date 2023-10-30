package LinkedList;

public class Palindrome {
    public static boolean isPalindrome(Node<Integer> head) {

        boolean result=true;
        Node<Integer> temp=head;
        Node<Integer> newhead=reverse(temp);

        while(head!=null && newhead!=null){
            if(head.data==newhead.data){
                head=head.next;
                newhead=newhead.next;
            }
            else
                return false;
        }

        return true;



    }
    public static Node<Integer> reverse(Node<Integer> head1){
        if(head1==null || head1.next==null){
            return head1;
        }

        Node<Integer> smallhead=reverse(head1.next);
        Node<Integer> tail=head1.next;

        tail.next=head1;
        head1.next=null;
        return smallhead;

    }

    public static void main(String[] args) {

        Node<Integer> head=Node.takeInput();
        System.out.println(isPalindrome(head));
    }
}
