class Solution:
    def maximumLengthSubstring(self, s: str) -> int:
        freq = defaultdict(int)
        left = 0
        res = 0
        for right in range(len(s)):
            freq[s[right]]+=1
            while freq[s[right]]>2:
                  freq[s[left]]-=1
                  left+=1
            res = max(res, right - left + 1)
        return res
            

        