class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        data = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for i in s:
                count[ord(i)-ord("a")]+=1
            data[tuple(count)].append(s)
        return list(data.values())
            
        