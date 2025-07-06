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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single-node list is a palindrome
        }

        // Step 1: Count the total number of nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Calculate the size of the first half
        // For lists like 1->2->3->2->1 (count=5), first half (s) is 2 (values 1, 2)
        // For lists like 1->2->2->1 (count=4), first half (s) is 2 (values 1, 2)
        int s = count / 2; // 's' is the number of elements in the first half

        // Step 3: Populate ArrayList with the values of the first half
        ArrayList<Integer> firstHalfValues = new ArrayList<>();
        temp = head; // Reset temp to the head
        for (int i = 0; i < s; i++) {
            firstHalfValues.add(temp.val);
            temp = temp.next;
        }

        // Step 4: If the list has an odd number of elements,
        // advance 'temp' past the middle element.
        if (count % 2 != 0) {
            temp = temp.next;
        }

        // Step 5: Reverse the ArrayList containing the first half values
        Collections.reverse(firstHalfValues);

        // Step 6: Compare the reversed first half with the second half of the linked list
        // 'temp' is now at the beginning of the second half of the linked list.
        // 'firstHalfValues' is the reversed first half.
        for (int i = 0; i < s; i++) { // Iterate 's' times (comparing 's' pairs of values)
            if (!firstHalfValues.get(i).equals(temp.val)) {
                return false; // Mismatch found
            }
            temp = temp.next; // Move to the next node in the linked list's second half
        }

        return true;
    }
}