class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        count = 0
        left = 0
        total = 0
        for right in range(len(arr)):
            total += arr[right]
            if (right-left+1)==k:
                if total >= threshold*k:
                   count+=1
                total-=arr[left]
                left+=1
        return count

        