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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode curr = head, prev = temp;
        
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else prev = prev.next;
            curr = curr.next;
            
        }
        return temp.next;
    }
}