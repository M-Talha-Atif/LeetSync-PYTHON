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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> data = new PriorityQueue<ListNode>( (a,b) -> a.val-b.val );

        for (ListNode item : lists){
            if(item !=null ){
                data.offer(item);
            }
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (!data.isEmpty()){
            ListNode poppedNode = data.poll();
            current.next = poppedNode;
            current = current.next;
            if(poppedNode.next!=null){
                data.offer(poppedNode.next);
            }


           
        }

        return dummy.next;






        
    }
}