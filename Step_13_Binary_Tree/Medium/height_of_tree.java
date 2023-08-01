package Step_13_Binary_Tree.Medium;

import Step_13_Binary_Tree.BinaryTreeNode;

public class height_of_tree {
    public static void main(String[] args) {

    }
    public static int maxdepth(BinaryTreeNode<Integer> root){
        if(root == null) return 0;

        return 1 + Math.max(maxdepth(root.left) , maxdepth(root.right));
    }
}
