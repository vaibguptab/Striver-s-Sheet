package LinkedList.Medium;

public class sort_List {
    public Node<Integer> sortList(Node<Integer> head) {
        if(head==null || head.next == null) return head;

        Node<Integer> first = head , second = head.next;
        if(first.data > second.data){
            first.next = second.next;
            second.next = first;
            head = second;
            second = first.next;
        }

        while(second.next != null){
            if(first.data > second.data){
                first.next = second.next;
                second.next = first;
                second = first.next;
            } else if(first.data <= second.data){
                first = first.next;
                second = second.next;
            }
        }
        return head;
    }
}
