class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        data = set()
        res = 0
        left = 0
        for right in range(len(s)):
            while s[right] in data:
                  data.remove(s[left])
                  left+=1
            data.add(s[right])
            if len(data)==3:
                data.remove(s[left])
                left+=1
                res+=1
            
        return res
        