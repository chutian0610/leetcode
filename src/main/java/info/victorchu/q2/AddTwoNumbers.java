package info.victorchu.q2;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Version 1.0
 * @Description TODO
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode cursor = null;
        ListNode pre = null;
        int step = 0; // 进位
        // 结束条件: 两个数字都到头了
        while(l1 !=null || l2 !=null||step!=0){
            int value = add(l1,l2,step);
            int current = value %10;
            cursor = new ListNode(current);
            if(root ==null){
                root =cursor;
                pre = root;
            }else {
                pre.next = cursor;
                pre = pre.next;
            }

            // 进位
            if(value>=10){
                step =1;
            }else {
                step =0;
            }
            if(l1 !=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }
        }
        return root;
    }

    private int add(ListNode l1, ListNode l2,int step){
        if(l1 == null){
            if(l2 ==null){
                return step;
            }else {
                return l2.val + step;
            }
        }else if(l2 == null){
            return l1.val+step;
        }else {
            return l1.val+l2.val+step;
        }
    }

}
