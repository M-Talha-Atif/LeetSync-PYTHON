class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        total = 0
        maxTotal = total
        for i in range(0, len(s)):
            if s[i] in vowels:
                total+=1
            if i>=k:
               check = s[i-k]
               if check in vowels:
                  total-=1
            maxTotal = max(total,maxTotal)
        return maxTotal


        