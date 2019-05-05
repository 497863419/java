package Ds.Test;

import Ds.FindK.FindK;

/**
 * @Name：判断一个回文链表
 * @Author：ZYJ
 * @Date：2019-05-05-16:17
 * @Description: 实现判断回文链表
 */
public class chkpalindrome {

public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public boolean judgePalindrome(ListNode A){
      if(A==null||A.next==null){
          return true;
      }
      //找中点
        ListNode F=A;
      ListNode S=A;
      while (F!=null&&S!=null&&F.next!=null){
          F=F.next.next;
          S=S.next;
      }
      ListNode mid = S;//找到中点
        if(mid.next==null){//两个
            if(A.val==mid.val){
                return true;
            }else{
                return  false;
            }
        }else{//至少三个节点
            //2.翻转链表
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next=mid;
            ListNode fast=mid;
            ListNode low =fast.next;
            while(low!=null){
                fast.next=low.next;
                low.next=dummyHead.next;
                dummyHead.next=low;
                low=fast.next;
            }

            while (A!=null&&dummyHead.next!=null){
                if(A.val!=dummyHead.next.val){
                    return  false;
                }
                A=A.next;
                dummyHead.next=dummyHead.next.next;
            }
            return true;
        }
    }


    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2= new ListNode(2);
        node1.next=node2;
        chkpalindrome chkpalindrome = new chkpalindrome();
        System.out.println(chkpalindrome.judgePalindrome(node1));

    }

}
