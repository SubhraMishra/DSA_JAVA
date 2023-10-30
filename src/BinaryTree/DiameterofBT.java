package BinaryTree;

public class DiameterofBT {

       public static int Diameter(BinaryTree root){
           int d[]=new int[1];
           helper(root,d);
           return d[0];
    }

      public static int helper(BinaryTree root,int[] d){
           if(root==null)
               return 0;

           int lefth=helper(root.left,d);
           int righth=helper(root.right,d);

           d[0]=Math.max(d[0],lefth+righth+1);

           return Math.max(lefth,righth)+1;
      }

    public static void main(String[] args) {
        BinaryTree root=BinaryTree.input();
        BinaryTree.print(root);
        int x=Diameter(root);
        System.out.print(x);


    }
}
