class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        maping = defaultdict(list)
        for string in strs:
            maping["".join(sorted(string))].append(string)
        
        container = []
        # print(maping.values())
        for i in maping.values():
            container.append(i)
        return   container
        