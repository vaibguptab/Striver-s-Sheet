package Step_13_Binary_Tree.Medium;

import Step_13_Binary_Tree.BinaryTreeNode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class boundary_traversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputbetter(true , 0 , true);
        ArrayList<Integer> ans=boundary(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> boundary(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(isleaf(root) == false) res.add(root.data);
        leftboundary(res , root);
        leaves(res , root);
        rightboundary(res , root);
        return res;
    }

    private static void rightboundary(ArrayList<Integer> res, BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null){
            if (!isleaf(curr)) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        for (int i = temp.size()-1 ;i>=0 ;i--){
            res.add(temp.get(i));
        }
    }

    private static void leaves(ArrayList<Integer> res, BinaryTreeNode<Integer> root) {
        if (isleaf(root)){
            res.add(root.data);
            return;
        }
        if (root.left !=null) leaves(res , root.left);
        if (root.right !=null) leaves(res , root.right);
    }

    private static void leftboundary(ArrayList<Integer> res, BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> node = root.left;
        while (node!=null){
            if(isleaf(node)==false) res.add(node.data);
            if (node.left !=null)node = node.left;
            else node = node.right;
        }
    }

    private static boolean isleaf(BinaryTreeNode<Integer> root) {
        return root.left==null && root.right==null;
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
