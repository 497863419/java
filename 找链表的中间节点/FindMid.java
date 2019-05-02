package Ds.FindMid;

/**
 * @Name： 利用快慢指针找中间节点
 * @Author：ZYJ
 * @Date：2019-04-29-16:23
 * @Description:
 */
public class FindMid {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static  ListNode middleNode(ListNode head) {
        ListNode F = head;
        ListNode S = head;
        while (F != null && S != null && F.next != null) {
            F = F.next.next;
            S = S.next;
        }
        return S;
    }

    public static void main(String[] args) {
        ListNode node1 = new  ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3= new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 =new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

       FindMid findMid = new FindMid();
        ListNode result=findMid.middleNode(node1);
        System.out.println(result.val);


    }

}
