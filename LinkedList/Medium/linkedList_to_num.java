package LinkedList.Medium;

public class linkedList_to_num {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> head2 = new Node<>(2);
        Node<Integer> head3 = new Node<>(3);
        Node<Integer> head4 = new Node<>(4);
        Node<Integer> head5 = new Node<>(5);
        Node<Integer> head6 = new Node<>(6);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        System.out.println(num(head));
    }

    private static int num(Node<Integer> head) {

        int len = 0;
        Node<Integer> temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int mul = (int) Math.pow(10 , len-1);
        int sum = 0;
        Node<Integer> temp2 = head;
        while (temp2 != null){
            sum += temp2.data * mul;
            mul = mul/10;
            temp2 = temp2.next;
        }
        return sum + 1;
    }
}
