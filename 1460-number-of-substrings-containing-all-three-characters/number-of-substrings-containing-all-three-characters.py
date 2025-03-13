class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        def solve(string):
            left, res = 0,0
            data = defaultdict(int)
            for right in range(len(string)):
                data[s[right]]+=1
                while data["a"]>=1 and data["b"]>=1 and  data["c"]>=1 :
                      data[s[left]]-=1
                      left+=1
                res = res + (right-left+1)
            return res
        n = len(s)
        # solve(string) will return substrings that don't have abc in them
        return n*(n+1)//2 - solve(s)

        