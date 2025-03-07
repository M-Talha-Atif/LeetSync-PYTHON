class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
       # find longest same character string
       # maximum frequency
       maxFreq = 0
       data = defaultdict(int)
       left = 0
       length = 0
       for right,element in enumerate(s):
           # add the element
           data[element]+=1
           currLength = right-left+1
           maxFreq = max(data.values())
           if currLength - maxFreq > k:
              data[s[left]]-=1
              left+=1
           length = max(length, right-left+1)
       return length
        