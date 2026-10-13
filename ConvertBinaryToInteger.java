// LeetCode 1290: Convert Binary Number in a Linked List to Integer
// LeetCode provides the ListNode class.
class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode current = head;

        while (current != null) {
            result = result * 2 + current.val;
            current = current.next;
        }

        return result;
    }
}
