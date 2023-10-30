package LinkedList;

public class Intersection_point {
    public static  Node<Integer> getIntersectionNode(Node<Integer> headA, Node<Integer> headB) {


        if(headA==null || headB==null)
            return null;
        Node<Integer> a=headA,b=headB;

        while(a!=b){

            a=a==null?headB:a.next;
            b=b==null?headA:b.next;

        }

        return a;

    }

    public static void main(String[] args) {
        Node<Integer> headA=Node.takeInput();
        Node<Integer> headB=Node.takeInput();
        System.out.println(getIntersectionNode(headA,headB));

    }
}
