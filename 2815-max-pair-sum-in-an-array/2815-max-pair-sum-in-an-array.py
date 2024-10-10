class Solution:
    def maxSum(self, nums: List[int]) -> int:
        count = 0
        n = len(nums)
        def check(a):
            largestA = 0
            # largestB = 0
            while a>0:
                largestA = max(largestA, a%10)
                a//=10
            # while b>0:
            #     largestB = max(largestB, b%10)
            #     b//=10
            return largestA 
                  
        maxSum = -1
        maping = defaultdict(list)
        for i in range(n):
            maping[check( nums[i] )].append( nums[i] )
        # print(maping)
        
        for value in maping.values():
            if len(value)>=2:
                m1 = max(value)
                value.remove(m1)
                m2 = max(value)
                maxSum = max(maxSum, m1 + m2)
        return maxSum
        