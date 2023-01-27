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
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        List<ListNode> visited = new ArrayList<>();
        visited.add(head);
        return help(visited, head);
    }
    
    public ListNode help(List<ListNode> visited, ListNode head){
        if(head.next == null) return null;
        if(visited.contains(head.next)){
            return visited.get(visited.indexOf(head.next));
        } 
        visited.add(head.next);
        return help(visited, head.next);
    }
}