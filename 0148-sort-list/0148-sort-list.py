# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        data = []
        temp = head
        while temp:
              data.append(temp.val)
              temp = temp.next
        dummy = head
        data = sorted(data)
        while dummy:
              dummy.val = data.pop(0)
              dummy = dummy.next
        return head
              
              
        