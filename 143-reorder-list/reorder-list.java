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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 1->2 ->3 -> 4

       

        ListNode prev = reverseList(slow.next);  // 4->3

        slow.next = null;

        // 4 -> 3 
        // middle at slow node


        ListNode leftPart = head;
        ListNode rightPart = prev;
        ListNode leftNext = null , rightNext = null;

        while( leftPart!=null && rightPart!=null ){
            // save both next nodes
            leftNext  = leftPart.next;
            rightNext = rightPart.next;

            // poin out to the node

            leftPart.next = rightPart;
            leftPart = leftNext;

            rightPart.next = leftPart;
            rightPart = rightNext;    
        }
       
    }
       public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null) {
              next = current.next;
              current.next = prev;
              prev = current;
              current = next;
        }

        return prev;

        
    }
}