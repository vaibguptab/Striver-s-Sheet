package Step_13_Binary_Tree;


public class tree_from_arr {
    public static void main(String[] args) {
        int[] arr = {11,22,3,54,15,23,21};
        BinaryTreeNode<Integer> root = tree(arr);
        print(root);
    }

    private static BinaryTreeNode<Integer> tree(int[] arr) {
            return  helper(arr , 0 , arr.length);
    }

    private static BinaryTreeNode<Integer> helper(int[] arr, int i, int length) {
        BinaryTreeNode<Integer> root = null;
        if (i<length){
            root = new BinaryTreeNode<>(arr[i]);
            root.left = helper(arr , 2*i+1 , length);
            root.right = helper(arr , 2*i+2 , length);
        }
        return root;
    }


    public static void print(BinaryTreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
