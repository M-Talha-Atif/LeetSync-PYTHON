# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        newNode = ListNode()
        hello = newNode
        head = head.next
        current = 0
        while head and head.val==0:
              head = head.next # skip 0's after head
        while head:
              if head.val==0:
                 hello.next = ListNode(current)
                 hello = hello.next
                 current = 0
              else:
                 current += head.val
              head = head.next
        return newNode.next

              
        