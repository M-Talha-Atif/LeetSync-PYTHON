# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        data = set(nums)
        prev= None
        starting = head
        # 3 1
        while head:
              if head.val in data:
                 if head == starting:
                    starting = starting.next
                    prev = starting
                    
                 else:
                    prev.next = head.next 
              else:
                 prev = head

              head=head.next
        return starting
              

        