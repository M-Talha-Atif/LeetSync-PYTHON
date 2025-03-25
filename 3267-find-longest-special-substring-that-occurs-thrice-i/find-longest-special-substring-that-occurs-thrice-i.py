class Solution:
    def maximumLength(self, s: str) -> int:
        def countLetters(s):
            return len(set(s)) == 1

        freq = defaultdict(int)

        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                data = s[i:j]
                if countLetters(data):
                    freq[data]+=1
        res = -1
        for a,b in freq.items():
            if b>=3:
                res = max(len(a),res)
        return res


        
    
        # check how many times it comes

        