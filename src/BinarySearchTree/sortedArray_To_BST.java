package BinarySearchTree;

import java.util.Scanner;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {
     }

     TreeNode(int val) {
         this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }


     public TreeNode input() {
         System.out.println("Enter root data");
         Scanner sc = new Scanner(System.in);
         int rootdata = sc.nextInt();

         if (rootdata == -1)
             return null;
         TreeNode root = new TreeNode(rootdata);

         TreeNode left = input();
         TreeNode right = input();
         root.left = left;
         root.right = right;

         return root;

     }

     public static void printTree(TreeNode root) {
         printTreeHelper(root);
     }

     public static void printTreeHelper(TreeNode root) {
         if (root == null)
             return;

         System.out.print(root.val + ":");
         if (root.left != null) {
             System.out.print("L" + root.left.val + " ");
         }
         if (root.right != null) {
             System.out.print("L" + root.right.val + " ");
         }
         System.out.println();

         printTreeHelper(root.left);
         printTreeHelper(root.right);


     }


     public class sortedArray_To_BST {

         public static TreeNode arrToBst(int nums[]) {
             if (nums.length == 0)
                 return null;

             TreeNode head = helper(nums, 0, nums.length - 1);
             return head;
         }

         private static TreeNode helper(int[] nums, int low, int high) {
             if (low > high)
                 return null;

             int mid = low + (high - low) / 2;
             TreeNode root = new TreeNode(nums[mid]);
             root.left = helper(nums, low, mid - 1);
             root.right = helper(nums, mid + 1, high);
             return root;
         }

         public static void main(String[] args) {
             int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
             TreeNode root = arrToBst(nums);
             printTree(root);
         }




     }
 }
