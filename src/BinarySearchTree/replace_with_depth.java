package BinarySearchTree;

public class replace_with_depth {
    static int m=0;

    public static void changeToDepthTree(TreeNode root) {
        //Your code goes here
        helper(root,0);
    }

    private static void helper(TreeNode root,int level){
        if(root==null)
            return;

        root.val=level;
        helper(root.left,level+1);
        helper(root.right,level+1);

    }

    public static void main(String args[]){

        TreeNode x=new TreeNode();
        TreeNode r=x.input();
        changeToDepthTree(r);
        x.printTree(r);

    }


}
