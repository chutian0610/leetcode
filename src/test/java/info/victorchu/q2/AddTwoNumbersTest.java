package info.victorchu.q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    static String printListNode(ListNode node){
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null){
            stringBuilder.append(node.val);
            stringBuilder.append("->");
            node = node.next;
        }
        stringBuilder.setLength(stringBuilder.length()-2);
        return stringBuilder.toString();
    }

    public static class ListBuilder{
        public ListNode root;
        public ListNode current;
        public ListBuilder next(int n){
            if(root ==null){
                root = new ListNode(n);
                current = root;
            }else {
                ListNode tmp = new ListNode(n);
                current.next = tmp;
                current = tmp;
            }
            return this;
        }
        public ListNode build(){
            return root;
        }
    }

    @Test
    public void addTwoNumbers() {
        ListNode a = new ListBuilder().next(2).next(4).next(3).build();
        ListNode b = new ListBuilder().next(5).next(6).next(4).build();
        System.out.println(printListNode(a));
        System.out.println(printListNode(b));
        System.out.println(printListNode(new AddTwoNumbers().addTwoNumbers(a,b)));
    }
}