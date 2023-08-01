package Step_13_Binary_Tree.Medium;

import Step_13_Binary_Tree.BinaryTreeNode;

public class check_tree_balanced_or_not {
    public static void main(String[] args) {

    }
    public static boolean check_balanced(BinaryTreeNode<Integer> root){
        return dfs(root) != -1;
    }

    private static int dfs(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;
        int lh = dfs(root.left);
        if(lh==-1) return -1;
        int rh = dfs(root.right);
        if (rh==-1) return -1;

        if(Math.abs(lh-rh)>1) return -1;

        return Math.max(lh , rh);
    }
}
