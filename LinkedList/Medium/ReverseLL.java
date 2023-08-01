package LinkedList.Medium;

public class ReverseLL {
    public static void main(String[] args) {

    }
    static Node reverseList(Node head)
    {
        // code here
        Node prev = null , curr = head;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
