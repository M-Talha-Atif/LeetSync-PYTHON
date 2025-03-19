class Solution:
    def longestSubarray(self, nums: List[int], limit: int) -> int:
        maxi,mini = 0,10**9
        left = 0
        res = 0
        # 2,3,5,6,7
        min_queue = deque()  # Monotonic increasing (stores min values)
        # 5,4,3,2,1
        max_queue = deque()  # Monotonic decreasing (stores max values)
        for right in range(len(nums)):
            # maintains a smaller element at top
            # it will pop last element
           while min_queue and min_queue[-1] > nums[right]:
              min_queue.pop()
           min_queue.append(nums[right])
           # keep elements < in maxque due to current max
           while max_queue and   max_queue[-1] < nums[right]:
               max_queue.pop()
           max_queue.append(nums[right])

           # If the window is invalid, shrink it from the left
           while max_queue[0] - min_queue[0] > limit:
            if nums[left] == min_queue[0]:
                min_queue.popleft()
            if nums[left] == max_queue[0]:
                max_queue.popleft()
            left += 1  
           res = max(res, right-left+1)
        return res
        