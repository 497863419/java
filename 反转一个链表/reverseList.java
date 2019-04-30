package Ds.RevererListNode;

/**
 * @Name： 反转一个链表
 * @Author：ZYJ
 * @Date：2019-04-29-16:29
 * @Description:
 */
public   class reverseList {
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

    /**
     * 方法 1   三指针法  空间复杂度为O(1)
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        if (head == null || head.next == null) {
            return null;
        } else {
            ListNode F = dummyHead.next;
            ListNode S = F.next;
            while (S != null) {
                F.next = S.next;
                S.next = dummyHead.next;
                dummyHead.next = S;
                S = F.next;
            }
            return dummyHead.next;
        }
    }

    /**
     * 方法二    时间复杂度为O(n) 空间复杂度为O(1)
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        ListNode fir = new ListNode(-1);
        //从前往后遍历原链表
        for (ListNode temp = head; temp != null; temp = temp.next) {
            //使用头插法插入新链表
            ListNode newNode = new ListNode(temp.val);
            newNode.next = fir.next;
            fir.next = newNode;
        }
        return fir.next;

    }
    public static void main(String[] args) {
        ListNode node1 = new  ListNode(1);
        ListNode node2=new ListNode(2);

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 =new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        reverseList reverseList = new reverseList();
        ListNode result=reverseList.reverseList2(node1);
        for(ListNode temp =result;temp!=null;temp=temp.next){
            System.out.print(temp.val+"->");
        }
    }
}
