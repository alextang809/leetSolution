/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class 141_LinkedListCircle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isFound = false;
        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isFound = true;
                return isFound;
            }
        }
        return false;
    }
}
