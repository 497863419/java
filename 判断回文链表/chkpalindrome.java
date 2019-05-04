package Ds.chkpalindrome;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-04-30-21:04
 * @Description:
 */
public class chkpalindrome {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4= new ListNode(3);
        ListNode node5=new ListNode(1);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        chkpalindrome chkpalindrome = new chkpalindrome();
        System.out.println( chkpalindrome.chkpalindrome(node1));

    }
    public static boolean chkpalindrome(ListNode A) {
        //找中间节点
        if (A == null || A.next == null) {//[]  [1]
            return false;
        }
        ListNode F = A;
        ListNode S = A;
        while (F != null && S != null & F.next != null) {
            F = F.next.next;
            S = S.next;
        }
        // 1   2    3
        //    mid
        ListNode mid = S;
        //连环翻转
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = mid;
        if (mid.val == A.val) {
            return true;
        } else {
            if (mid.next == null) {
                return false;
            } else {
                ListNode fast = mid;
                ListNode slow = fast.next;
                while (slow != null) {
                    fast.next = slow.next;
                    slow.next = dummyHead.next;
                    dummyHead.next = slow;
                    slow = fast.next;
                }

                //判断
                while (A != null && dummyHead.next != null) {
                    if (A.val != dummyHead.next.val) {
                        return false;
                    }
                    A = A.next;
                    dummyHead = dummyHead.next;
                }
                return true;
            }
        }

    }

}
