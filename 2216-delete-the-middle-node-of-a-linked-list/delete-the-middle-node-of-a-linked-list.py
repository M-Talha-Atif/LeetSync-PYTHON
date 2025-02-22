# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head.next:
            return head.next
        slow,fast = head,head
        tempi = head
        temp = None
        while fast and fast.next:
              temp = slow
              slow = slow.next
              fast = fast.next.next
        if temp:
           temp.next = slow.next
        return tempi 
        