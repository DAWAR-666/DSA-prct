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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        arr.add(temp.val);
        while(temp!=null){
            if(temp.val==arr.get(arr.size()-1)){
                temp=temp.next;
            }
            else{
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        temp=head;
        for(int i=0;i<arr.size();i++){
            temp.val=arr.get(i);
            if(i==arr.size()-1){
                temp.next=null;
                break;
            }
            else{temp=temp.next;}

        }
        return head;
    }
}