class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(t) > len(s):
            return ""
        if len(t) == 1 and s == t:
            return s
        if len(t) == len(s) and s == t:
            return s
        data = ''
        current = 1000000
        left = 0 # for shrinking
        maping = defaultdict(int) # to hold t characters
        t_map = defaultdict(int)

        for i in t:
            t_map[i] +=1

        def comparing(a, b):
            for k in b:
               if a[k] < b[k]:
                    return False
            return True 

        for right in range( 0, len(s)):
        
            if s[right] in t: # if present then increment frequency
               maping[s[right]] +=1 # increase 
            
        

            while comparing(maping,t_map):
                difference = right - left + 1
                if difference < current:
                  current = difference
                    # picking all characters from left to right
                  data =  s[ left: right+1 ]
                if s[left] in maping:
                   maping[ s[left] ] -= 1
                   if maping[s[left]] == 0:
                      del maping[s[left]]
                # no need of this as current window size increased
                left+=1
            
        return data
        
        