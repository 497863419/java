package Ds.Test;

/**
 * @Name：找中间节点
 * @Author：ZYJ
 * @Date：2019-05-05-19:32
 * @Description:
 */
public class Findmid {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static  ListNode findMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }else {
            ListNode F=head;
            ListNode S=head;
            while (F!=null&&S!=null&&F.next!=null){
                F=F.next.next;
                S=S.next;
            }
            return S;
        }
    }
}
