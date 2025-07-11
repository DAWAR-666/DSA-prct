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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int targetPositionFromStart = count - n;
        if (targetPositionFromStart == 0) {
            return head.next; 
        }
        temp = head;
        for (int i = 0; i < targetPositionFromStart - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) { 
            temp.next = temp.next.next;
        }

        return head;
    }
}