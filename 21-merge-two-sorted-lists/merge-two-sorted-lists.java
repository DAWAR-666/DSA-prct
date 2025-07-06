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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int c1=0;
        int c2=0;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null){
            c1++;
            t1=t1.next;
        }
        while(t2!=null){
            c2++;
            t2=t2.next;
        }
        int c3=c1+c2;
        t1=list1;
        t2=list2;
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<c3;i++){
            if (i<c1 && t1!=null){
                arr.add(t1.val);
                t1=t1.next;
            }
            else if(i>=c1 && t2!=null) {
                arr.add(t2.val);
                t2=t2.next;
            }
        }
        Collections.sort(arr);
        ListNode l3=new ListNode(0);
        ListNode current=l3;
        for (int val : arr) {
            current.next = new ListNode(val); // Create a new node and link it
            current = current.next;           // Move current to the newly added node
        }
        return l3.next;
    }
}