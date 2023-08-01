package LinkedList.Medium;

public class Middle_of_Linked_list {
    public static void main(String[] args) {
//        Node<Integer> head = new Node<>();
    }
    static int getMiddle(Node head)
    {
        // Your code here.
        if(head==null || head.next == null) return (int) head.data;

        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast.next.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return (int) slow.next.data;
    }
}
