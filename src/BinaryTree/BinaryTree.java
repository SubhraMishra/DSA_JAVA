package BinaryTree;
import java.util.Scanner;

public class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int data) {
        this.data = data;
    }


    public static BinaryTree input() {
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootdata = s.nextInt();
        if (rootdata == -1)
            return null;

        BinaryTree root = new BinaryTree(rootdata);
        BinaryTree leftchild = input();
        BinaryTree rightchild = input();
        root.left = leftchild;
        root.right = rightchild;
        return root;

    }

    public static void print(BinaryTree root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        print(root.left);
        print(root.right);


    }

}


