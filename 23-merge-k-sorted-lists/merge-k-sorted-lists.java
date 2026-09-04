/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        for (int i = 1; i < lists.length; i++) {
            lists[i] = merge(lists[i], lists[i - 1]);
        }
        return lists[lists.length-1];
    }
    private ListNode merge(ListNode t1,ListNode t2){
        ListNode res=new ListNode(0);
        ListNode cur=res;
        while(t1!=null &&t2!=null){
            if(t1.val<=t2.val){
                cur.next=t1;
                t1=t1.next;
                
            }else{
                cur.next=t2;
                t2=t2.next;
            }
            cur=cur.next;
        }
        if(t1!=null){
            cur.next=t1;
        }else{
            cur.next=t2;
        }
        return res.next;
    }
}