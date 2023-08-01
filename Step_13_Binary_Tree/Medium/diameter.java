package Step_13_Binary_Tree.Medium;

import Step_13_Binary_Tree.BinaryTreeNode;
//import jdk.nashorn.internal.ir.BinaryNode;

import java.util.Scanner;

public class diameter {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputbetter(true,0,true);
        System.out.println(diameter_of_tree(root));
    }
    public static int diameter_of_tree(BinaryTreeNode<Integer> root){
        int[] dia = new int[1];
        height(root , dia);
        return dia[0];
    }

    private static int height(BinaryTreeNode<Integer> root, int[] dia) {
        if (root == null) return 0;

        int lh = height(root.left , dia);
        int rh = height(root.right , dia);
        dia[0] = Math.max(dia[0] , lh+rh);
        return 1+Math.max(lh , rh);
    }

    public static BinaryTreeNode takeinputbetter(boolean isRoot, int parentdata, boolean isleftchild){
        if(isRoot){
            System.out.println("Enter root data");
        } else{
            if(isleftchild){
                System.out.println("Enter left child data of "+ parentdata);
            } else {
                System.out.println("Enter Right child data of "+parentdata);
            }
        }
        Scanner s = new Scanner(System.in);
        int  rootdata = s.nextInt();

        if(rootdata == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer> leftchild = takeinputbetter(false,rootdata,true);
        BinaryTreeNode<Integer> rightchild = takeinputbetter(false,rootdata,false);
        root.left = leftchild;
        root.right = rightchild;

        return root;
    }
}
