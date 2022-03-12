/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
		
		// first we make a map of old to new nodes which we will refer back to
        Map<Node, Node> oldNewSeen = new HashMap<>();
        Node current = head;
        while(current != null) {
            oldNewSeen.put(current, new Node(current.val));
            current = current.next;
        }
        
		// next build out the new LL based on the mapped nodes
        current = head;
        while(current != null) {
            if(current.next != null) {
                oldNewSeen.get(current).next = oldNewSeen.get(current.next);
            }
            if(current.random != null) {
                oldNewSeen.get(current).random = oldNewSeen.get(current.random);
            }
            current = current.next;
        }
        
		// return the new node identified by the "head" key node
        return oldNewSeen.get(head);
    }
}