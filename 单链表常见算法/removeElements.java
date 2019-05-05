package Ds.Test;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-05-19:35
 * @Description:
 */
public class removeElements {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode removeVal(ListNode head,int val){
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;
        ListNode prev =dummyHead;
        while (prev.next!=null){
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else{
                prev=prev.next;
            }
        }
        return head;
    }




}
