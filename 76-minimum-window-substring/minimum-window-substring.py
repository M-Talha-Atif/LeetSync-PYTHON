class Solution:
    def minWindow(self, s: str, t: str) -> str:
        # variable length sliding window
        left = 0
        data = defaultdict(int)
        # key -> character, value -> integer
        for c in t:
            data[c]+=1
        counter = len(t)
        min_window = (0, float("inf"))
        start = 0

        for m in range(len(s)):
            if data[s[m]]>0:
               counter-=1
            data[s[m]]-=1
            if counter == 0:
                while True:
                     if data[s[start]] == 0:
                        break
                     data[s[start]]+=1
                     start+=1
                if m - start < min_window[1] - min_window[0]:
                    min_window = (start,m)
                counter+=1
                data[s[start]]+=1
                start+=1
        return "" if min_window[1] > len(s) else s[min_window[0]  : min_window[1]+1]
                


               

        