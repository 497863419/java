package Ds.Test;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-05-19:43
 * @Description:
 */
public class reverseL {
    public static class ListNode{
        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static  ListNode reverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }else {
            ListNode dummyhead = new ListNode(-1);
            dummyhead.next = head;
            ListNode F = dummyhead.next;
            ListNode S = F.next;
            while (S != null) {
                F.next = S.next;
                S.next = dummyhead.next;
                dummyhead.next = S;
                S = F.next;
            }
            return dummyhead.next;
        }
    }
}
