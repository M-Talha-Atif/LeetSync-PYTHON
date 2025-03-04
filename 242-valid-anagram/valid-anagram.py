class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count = [0] * 26
        for i in s:
            count[ord(i) - ord('a')]+=1
        for i in t:
            count[ord(i) - ord('a')]-=1
        for c in count:
            if c!=0:
                return False
        return True
        