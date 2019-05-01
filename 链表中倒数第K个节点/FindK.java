package Ds.FindK;

/**
 * @Name： 找倒数第K个节点
 * @Author：ZYJ
 * @Date：2019-04-29-16:07
 * @Description: 利用快慢指针找倒数第K个节点
 */
public class FindK {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);//3
        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        FindK findK = new FindK();
        ListNode result = findK.FindKToTail(node1, 3);
        System.out.println(result.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode FindKToTail(ListNode head, int k) {
        if (head != null) {
            ListNode F = head;
            ListNode S = head;
            for (int i = 0; i < k; i++) {
                if (F != null) {
                    F = F.next;
                } else {
                    return null;
                }
            }
            while (F != null) {
                F = F.next;
                S = S.next;
            }
            return S;
        }
        return null;
    }

}


