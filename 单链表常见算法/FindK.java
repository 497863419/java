package Ds.Test;

import org.w3c.dom.NodeList;

/**
 * @Name：找倒数第k个节点
 * @Author：ZYJ
 * @Date：2019-05-05-19:27
 * @Description:
 */
public class FindK {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode FindK(ListNode head,int k){
        if(head!=null){
            ListNode F =head;
            ListNode S =head;
            for(int i=0;i<k;i++){
                if(F!=null){
                    F=F.next;
                }else{
                    return null;
                }
            }
            while (F!=null){
                S=S.next;
                F=F.next;
            }
            return S;
        }
        return null;
    }
}
