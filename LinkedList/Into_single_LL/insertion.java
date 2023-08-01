package LinkedList.Into_single_LL;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {9 ,0 ,5 ,1 ,6 ,1 ,2 ,0 ,5 ,0};
        Node head = null;
        for (int i = 0;i<arr.length;i+=2){
            if (arr[i+1]==0){
                insertAtBeginning(head , arr[i]);
            } else if (arr[i+1]==1) {
                insertAtEnd(head , arr[i]);
            }
        }
    }
    static Node insertAtBeginning(Node head, int x)
    {
        if(head==null){
            Node curr = new Node(x);
            head = curr;

        }
        Node curr = new Node(x);
        curr.next = head;
        return curr;
    }

    //Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node end = new Node(x);
        temp.next = end;
        return temp;
    }
}
