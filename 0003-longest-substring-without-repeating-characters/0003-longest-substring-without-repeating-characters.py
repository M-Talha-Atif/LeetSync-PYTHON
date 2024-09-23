class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left, right = 0,0
        length = 0
        maping = {}
        while right < len(s):
         if s[right] in maping and maping[s[right]]>=left:
            left = maping[  s[right] ] + 1
         maping[ s[right] ] = right
         length = max( length, right - left + 1)
         right+=1
        return length
        