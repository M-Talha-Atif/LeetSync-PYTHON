class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        
        # Start visualizing the process
        print(f"Initial array: {nums}")
        print(f"Target to find: {target}\n")
        
        while left <= right:
            mid = (left + right) // 2
            
            # Print current state
            print(f"Left: {left}, Right: {right}, Mid: {mid}")
            print(f"Current mid value: {nums[mid]}")
            print(f"Current array slice being considered: {nums[left:right+1]}")
            
            if nums[mid] == target:
                print(f"Target found at index {mid}\n")
                return mid
            
            # Check if left half is sorted
            if nums[left] <= nums[mid]:
                print("Left half is sorted.")
                if nums[left] <= target < nums[mid]:
                    print("Target is in the left half.")
                    right = mid - 1
                else:
                    print("Target is in the right half.")
                    left = mid + 1
            # Otherwise, right half is sorted
            else:
                print("Right half is sorted.")
                if nums[mid] < target <= nums[right]:
                    print("Target is in the right half.")
                    left = mid + 1
                else:
                    print("Target is in the left half.")
                    right = mid - 1
            
            print()  # Blank line for better readability
        
        print("Target not found in the array.\n")
        return -1
