class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        result = nums[0]
        for i in range(1,len(nums)):
            result ^= nums[i]
        setBit = (result ^ (result-1)) & result # get rightmost first set bit
        # take two buckets
        n1,n2= 0,0
        for i in nums:
            if i & setBit:
               n1 ^= i
            else:
                n2^= i
        return [n1,n2]

        