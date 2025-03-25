class Solution:
    def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
        # at most k or k-1 times
       maxFreq = 0
       data = defaultdict(int)
       s = answerKey
       left = 0
       length = 0
       # same character in string
       # currLength - k
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

        