package Ds.RemoveElement;


import java.sql.SQLOutput;

/**
 * @Name： 删除链表中所有值为val的元素
 * @Author：ZYJ
 * @Date：2019-04-29-18:44
 * @Description:
 */
public class removeElement {
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

    public  ListNode removeElements(ListNode head,int val){
        //传入的链表为空 或者 头节点的值为val
        //eg:6->1->2->6
        while(head!=null&&head.val==val){
            head=head.next;
        }
        //6->6->6->6  这种情况下 上一步已删除完毕 此时链表为空
        if(head==null){
            return null;
        }
        //此时的链表头节点一定不为空 且 第一个节点的值一定不是val
        //创建前驱节点
        ListNode prve =head;
        while (prve.next!=null){
            if(prve.next.val==val){
                prve.next=prve.next.next;
            }else {
                prve=prve.next;
            }
        }
        return  head;
    }

    public static void main(String[] args) {
        ListNode node1 = new  ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3= new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 =new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        removeElement removeElement = new removeElement();
        ListNode result=removeElement.removeElements(node1,6);
        for(ListNode temp =result;temp!=null;temp=temp.next){
            System.out.print(temp.val+"->");
        }

    }
}
