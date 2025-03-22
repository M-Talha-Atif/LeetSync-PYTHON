class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        data1,data2 = defaultdict(int),defaultdict(int)
        if len(s1)>len(s2):
            return False
        # store frequencies
        for i in range(len(s1)):
            data1[s1[i]]+=1
            data2[s2[i]]+=1
        if data1==data2:
            return True
        left = 0
        for right in range(len(s1),len(s2)):
            data2[s2[right]]+=1

            data2[s2[left]]-=1

            if data2[s2[left]]==0:
                del data2[s2[left]]
            left+=1
            
            if data1==data2:
                return True
        return False

        

        