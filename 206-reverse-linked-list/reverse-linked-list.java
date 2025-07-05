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
    public ListNode reverseList(ListNode head) {
        int count =0;
        ListNode temp=head;
        ArrayList <Integer> arr=new ArrayList<>();
        while (temp!=null){
            count++;
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=count-1;i>=0;i--){
            temp.val=arr.get(i);
            temp=temp.next;
        }
        return head;
    }
}