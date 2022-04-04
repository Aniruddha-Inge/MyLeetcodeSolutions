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
    public ListNode swapNodes(ListNode head, int k) {
     
        Map<Integer, ListNode> nodes = new HashMap<>();
        
        int i = 1;
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            nodes.put(i, cur);
            i++;
            cur = cur.next;
            len++;
        }
        
        int toSwap = i - k;
        
        ListNode dummy = new ListNode(-1);
        cur = dummy;
        
        for (int j = 1; j < i; j++) {
            
            if (j == k) {
                
                cur.next = new ListNode(nodes.get(toSwap).val);
            } else if (j == toSwap) {
                
                cur.next = new ListNode(nodes.get(k).val);
            } else {
                
                cur.next = new ListNode(nodes.get(j).val);
            }
            
            cur = cur.next;
        }
        
        return dummy.next;
    }
}