package LinkedList.Double_LL;

class DoubleNode{
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int x){
        data = x;
        next = null;
        prev = null;
    }

}
public class Array_to_Double_LL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        DoubleNode ans = constructDLL(arr);
    }
    static DoubleNode constructDLL(int arr[]) {
        // Code here
        DoubleNode head = new DoubleNode(arr[0]);
        head.prev = null;

        DoubleNode temp = head;
        for(int i = 1;i<arr.length ; i++){
            temp.next = new DoubleNode(arr[i]);
            temp.prev = new DoubleNode(arr[i-1]);
            temp = temp.next;
        }

        return head;
    }
}
