# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseTheList(self,head):
        current,nextPtr,prev = head, None, None
        while current:
              nextPtr = current.next
              current.next = prev
              prev = current
              current = nextPtr
              
        return prev
    
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        re = self.reverseTheList(head)
        temp = re
        while re:
              agla = re.next
              if agla and re.val > agla.val:
                 p = agla.next
                 re.next = p
              else:
                re = re.next
        temp = self.reverseTheList(temp)
                 
        return temp
        