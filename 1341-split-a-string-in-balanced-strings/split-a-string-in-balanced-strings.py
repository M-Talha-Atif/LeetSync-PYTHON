class Solution:
    def balancedStringSplit(self, s: str) -> int:
        #5, 1, 2, 3, 4
        balanced = 0
        count = 0
        for i in s:
            if i=='R':
               balanced-=1
               if balanced==0:
                  count+=1
            else:
               balanced+=1
               if balanced==0:
                  count+=1
        
        return count