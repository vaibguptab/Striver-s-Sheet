package LinkedList.Medium;

public class delete_the_middle_node {
    public static void main(String[] args) {

    }
    static int getMiddle(Node head)
    {
        if(head==null || head.next == null) return (int) head.data;
        Node prev = new Node<>(0);
        prev.next = head;
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast.next.next!=null && fast!=null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return (int) slow.next.data;
    }
}
