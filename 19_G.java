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
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        if(head.next == null) return null;
        
        ListNode tem = new ListNode(head.val,head.next);
        while(tem.next != null){
            tem = tem.next;
            list.add(tem);
        }
        if(n == list.size()){
            return list.get(1);
        } 
        list.get(list.size()-n-1).next = list.get(list.size()-n).next;
        return head;
    }
}