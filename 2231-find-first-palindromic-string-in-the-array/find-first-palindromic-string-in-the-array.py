class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        def checkPalindrome(string):
            left,right=0,len(string)-1
            while left<=right:
                  if string[left]!=string[right]:
                     return False
                  left+=1
                  right-=1

            return True
        for i in words:
            if checkPalindrome(i):
                return i
        return ""

        