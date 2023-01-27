/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        if(headA.equals(headB)) return headA;

        List<ListNode> ListA = new ArrayList<>();
        ListA.add(headA);
        while(headA.next != null){
            headA = headA.next;
            ListA.add(headA);
        }

        while(headB.next != null){
            if(ListA.contains(headB)) return headB;
            headB = headB.next;
        }
        if(ListA.contains(headB)) return headB;

        return null;
    }
}