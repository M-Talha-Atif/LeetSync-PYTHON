# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addNumber(self,head,value,start):
        if head == None:
           head = ListNode(value,None)
           start = head
        else:
           newNode = ListNode(value,None)
           head.next = newNode
           head = newNode
        return (head,start)
           
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        # l3 = ListNode()
        l4 = None
        start = None
        while l1 and l2:
              result = l1.val+l2.val+carry
              if result>9:
                 result = result % 10
                 carry = 1
              else:
                carry = 0
              l4,start = self.addNumber(l4,result,start)
              l1 = l1.next
              l2 = l2.next

        while l1:
              result = l1.val+carry
              if result>9:
                 result = result % 10
                 carry = 1
              else:
                carry = 0
              l4,start = self.addNumber(l4,result,start)
              l1 = l1.next

        while l2:
              result = l2.val+carry
              if result>9:
                 result = result % 10
                 carry = 1
              else:
                carry = 0
              l4,start = self.addNumber(l4,result,start)
              l2 = l2.next

        if carry>0:
            l4,start = self.addNumber(l4,carry,start)
        return start
        