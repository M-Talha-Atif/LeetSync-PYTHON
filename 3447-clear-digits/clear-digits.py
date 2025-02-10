class Solution:
    def clearDigits(self, s: str) -> str:
        stack = []
        for i in s:
            if i.isdigit():
               if stack:
                  stack.pop(-1)
            else:
                stack.append(i)
        return "".join([x for x in stack])
        