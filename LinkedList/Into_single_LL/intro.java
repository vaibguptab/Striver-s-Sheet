package LinkedList.Into_single_LL;

class Node{
    int data;
    Node next;
    Node(){
        data = 0;
    }
    Node(int d){
        data = d;
    }
}
public class intro {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node ans = constructLL(arr);


    }
    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);

        Node temp = head;
        for(int i = 1;i<arr.length ; i++){
            Node curr = new Node(arr[i]);
            temp.next = curr;
            temp = temp.next;

        }
        return head;
    }
}
