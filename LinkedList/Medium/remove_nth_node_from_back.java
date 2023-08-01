package LinkedList.Medium;

public class remove_nth_node_from_back {
    public static void main(String[] args) {

    }
    public Node removeNthFromEnd(Node head, int n) {
        Node start = new Node(0);
        Node slow = start, fast = start;
        slow.next = head;

        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
