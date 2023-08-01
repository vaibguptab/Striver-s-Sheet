package LinkedList.Medium;

import java.util.Stack;

public class check_L_is_palindrome {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> head2 = new Node<>(2);
        Node<Integer> head3 = new Node<>(3);
        Node<Integer> head4 = new Node<>(3);
        Node<Integer> head5 = new Node<>(2);
        Node<Integer> head6 = new Node<>(1);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        System.out.println(check2(head));
    }

    private static boolean check(Node<Integer> head) {
        Node<Integer> slow = head ;
        boolean ispal = true;
        Stack<Integer> st = new Stack<Integer>();
        while (slow!=null){
            st.push(slow.data);
            slow = slow.next;
        }
        while (head!=null){
            int i = st.pop();
            if (head.data == i){
                ispal = true;
            }else {
                ispal = false;
                break;
            }
            head = head.next;
        }
        return ispal;
    }

    public  static  boolean check2(Node<Integer> head){
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast.next.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null , curr = slow.next;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        slow.next = null;
        while (prev!=null ||head!=null){
            if(prev.data !=head.data){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
