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
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        List<ListNode> visited = new ArrayList<>();
        visited.add(head);
        return help(visited, head);
    }
    
    public boolean help(List<ListNode> visited, ListNode head){
        if(head.next == null) return false;
        if(visited.contains(head.next)) return true;
        visited.add(head.next);
        return help(visited, head.next);
    }
}
