package Priority_Queue1;


public class Priority_QueueTest {

    public static void main(String args[]) throws PriorityQueueException{
        Priority_Queue<String> a=new Priority_Queue<>();
        a.insert("abc",12);
        a.insert("cutuuu",222);
        a.insert("sweetie",112);
        a.insert("babyyyy",6);
        a.insert("jaan",120);

        while(!a.isEmpty()){
            System.out.println(a.getMin());
            a.removeMin();
        }
    }



}
