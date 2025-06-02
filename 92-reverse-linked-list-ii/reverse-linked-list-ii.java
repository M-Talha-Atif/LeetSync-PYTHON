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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if  ( head==null || left == right){
                  return head;
        }
        ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode prev = dummy;

        // iterate till left skip nodes
        for(int i=0; i<left-1; i+=1){
            prev = prev.next;
        }
        ListNode current = prev.next; // node to be reverse
        ListNode temp;
        // current = 2
        // 2 -> 3 -> 4
        // 3 -> 2 -> 4

        // 2 -> 3 ->4
        // 1->3->2->4
        
        // 1->4->3->2
        for (int i=0; i< right - left; i+=1 ){
            // save the next node
            // save -> 4
            temp = current.next; // 3
            // 1-> 2-> 4
            // 3 -> 4

            // 2->
            current.next = temp.next;
            // 
            // 1->2 ,  3->2->4
            temp.next = prev.next;

            // 1->3->2->4
            prev.next = temp;

        }

        return dummy.next;





           

        
    }
}