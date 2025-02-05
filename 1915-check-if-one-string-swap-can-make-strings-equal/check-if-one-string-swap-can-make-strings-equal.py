class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        freq=defaultdict(int)
        diff = 0
        array = []

        for i in range(len(s1)):
            if s1[i]!=s2[i]:
                diff+=1
                array.append(s1[i])
                array.append(s2[i])
            if diff>2:
                return False
        if diff==2:
           if array[1]==array[2] and array[0]==array[3]:
              return True

            
        return diff==0 
        