package LinkedList.Medium;

public class Length_of_loop {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> head2 = new Node<>(2);
        Node<Integer> head3 = new Node<>(3);
        Node<Integer> head4 = new Node<>(4);
        Node<Integer> head5 = new Node<>(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head2;

        System.out.println(length(head));
    }

    private static int length(Node<Integer> head) {
        Node<Integer> slow = head , fast = head;
        while(slow.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        int length = 0;
        while(slow.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            length++;
            if(slow == fast){
                return length;
            }
        }
        return -1;
    }
}
