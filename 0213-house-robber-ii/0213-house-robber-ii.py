class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        def give(data, i, dp):
            if i >= len(data):
                return 0  # all elements done
            if i not in dp:
                skip = give(data, i + 1, dp)  # go for adjacent element
                pick = data[i] + give(data, i + 2, dp)  # skip adjacent element
                dp[i] = max(skip, pick)
            return dp[i]

        # Case 1: Exclude the first house, consider houses from index 1 to end
        dp1 = {}
        a = give(nums, 1, dp1)  

        # Case 2: Exclude the last house, consider houses from index 0 to second last
        dp2 = {}
        b = give(nums[:-1], 0, dp2)  # This part is correct

        # Return the maximum amount possible between the two cases
        return max(a, b)
