package Step_13_Binary_Tree.Medium;

import Step_13_Binary_Tree.BinaryTreeNode;

import java.util.*;


class Tuple {
    BinaryTreeNode node;
    int row;
    int col;
    public Tuple(BinaryTreeNode _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}
public class vertical_order {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputbetter(true , 0 , true);
        ArrayList<ArrayList <Integer>> ans = vertical(root);
//        ArrayList<ArrayList <Integer> ans2 = vertical_12(root);
        for (ArrayList< Integer > it: ans) {
            for (int nodeVal: it) {
                System.out.print(nodeVal + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> bottomView = bottom_view(root , ans);
        ArrayList<Integer> TopView = Top_view(root , ans);
        for(int e:bottomView) System.out.print(e + " ");
        System.out.println();
        for(int e:TopView) System.out.print(e + " ");
    }

    private static ArrayList<Integer> Top_view(BinaryTreeNode<Integer> root, ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> res = new ArrayList<>();
        for(ArrayList<Integer> it:ans){
            Object[] arr = it.toArray();
            res.add((Integer) arr[0]);
        }
        return res;
    }

    private static ArrayList<Integer> bottom_view(BinaryTreeNode<Integer> root, ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> res = new ArrayList<>();
        for(ArrayList<Integer> it:ans){
            Object[] arr = it.toArray();
            res.add((Integer) arr[arr.length-1]);
        }
        return res;
    }

//    private static ArrayList<ArrayList<Integer>> vertical_12(BinaryTreeNode<Integer> root) {
//        int left = left(root) , right = right(root) , total = 1 + left+ right;
//        ArrayList<ArrayList<Integer>> sub = new ArrayList<>(total);
//        BinaryTreeNode<Integer> curr = root;
//        while (curr!=null){
//            ArrayList<Integer> temp = new ArrayList<>();
//            int vertical = vertical_value(root ,curr);
//        }
//
//    }

//    private static int vertical_value(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> curr) {
//
//    }

    private static ArrayList<ArrayList<Integer>> vertical(BinaryTreeNode<Integer> root) {
        TreeMap < Integer, TreeMap < Integer, PriorityQueue < Integer >>> map = new TreeMap < > ();
        Queue < Tuple > q = new LinkedList < Tuple > ();
        q.offer(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            BinaryTreeNode<Integer> node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;


            if (!map.containsKey(x)) {
                map.put(x, new TreeMap < > ());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue < > ());
            }
            map.get(x).get(y).offer(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        ArrayList < ArrayList < Integer >> list = new ArrayList < > ();
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }

//    private static void function(ArrayList<Integer> res, BinaryTreeNode<Integer> root, int i) {
//
//    }
//
//    private static int right(BinaryTreeNode<Integer> root) {
//        int count = 0;
//        BinaryTreeNode<Integer> curr = root;
//        while (curr.right!=null){
//            if (curr!=null){
//                count++ ;
//                curr = curr.right;
//            }
//        }
//    }
//
//    private static int left(BinaryTreeNode<Integer> root) {
//        int count = 0;
//        BinaryTreeNode<Integer> curr = root;
//        while (curr.left!=null){
//            if (curr!=null){
//                count++ ;
//                curr = curr.left;
//            }
//        }
//    }

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
