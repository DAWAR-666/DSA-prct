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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        int x=0;
        int rem=0;
        while(x==0){
            int p,q;
            if(temp1==null){
                p=0;
            }else{
                p=temp1.val;
            }
            if(temp2==null){
                q=0;
            }else{
                q=temp2.val;
            }
            int sum=p+q+rem;
            if(sum>=10){
                rem=sum/10;
                sum=sum%10;
            }else{
                rem=0;
            }
            
            temp.next=new ListNode(sum);
            temp=temp.next;
            if (temp1!=null){temp1=temp1.next;}
            if (temp2!=null){temp2=temp2.next;}
            if(temp1==null && temp2==null && rem==0){
                x=1;
            }
        }
        return ans.next;
    }
}