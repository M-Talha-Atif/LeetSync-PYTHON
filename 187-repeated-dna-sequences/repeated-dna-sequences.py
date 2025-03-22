class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        ans , seen = set(),set()
        for i in range(0,len(s)-9):
            sub = s[i:i+10]
            if sub in seen:
                ans.add(sub)
            else:
               seen.add(sub)
        return list(ans)
        