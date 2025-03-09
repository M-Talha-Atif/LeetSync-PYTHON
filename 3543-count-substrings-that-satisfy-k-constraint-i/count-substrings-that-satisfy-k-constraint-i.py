class Solution:
    def countKConstraintSubstrings(self, s: str, k: int) -> int:
        left,right,c0,c1 = 0,0,0,0
        res = 0
        for right in range(len(s)):
            if s[right]=="0":
                c0+=1
            else:
                c1+=1
            while c0>k and c1>k:
                  if s[left]=="0":
                     c0-=1
                  else:
                     c1-=1
                  left+=1
            res = res + (right-left + 1)
        return res
            
        