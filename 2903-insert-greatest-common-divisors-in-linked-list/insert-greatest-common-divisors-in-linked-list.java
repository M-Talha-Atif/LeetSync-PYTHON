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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prevNode=head;
        ListNode currentNode=head.next;
        while(currentNode!=null){
            int gcd=calculateGCD(prevNode.val,currentNode.val);
            ListNode gcdNode=new ListNode(gcd);
            prevNode.next=gcdNode;
            gcdNode.next=currentNode;
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
            return head;
    }
    public int calculateGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}