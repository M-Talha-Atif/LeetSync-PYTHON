class Solution {

        // 1,2,2,3,3,4,5
        // 20/4 is 5 , so sum will be 5
        // 5 | 4,1 | 3,2 | 3,2
        // if total sum divided by k if not divisble then return false
        // sub1 is s1
        // sub2 is s2
        // s1 is s2 so can write as s1 + s1 
        // Time Complexity = O(n log n + k^n)
        // Space Complexity = O(k + n)   // buckets + recursion stack

// nums = [4,3,2,3,5,2,1], k = 4

// sort ascending → [1,2,2,3,3,4,5]

// target = 20/4 = 5

// call → backtrack(nums, 6, buckets=[0,0,0,0], target=5)

// Steps:

// pick 5 → bucket[0]=5 → [5,0,0,0] ✅

// pick 4 → bucket[0]=9 ❌ → bucket[1]=4 → [5,4,0,0] ✅

// pick 3 → bucket[0]=8 ❌ → bucket[1]=7 ❌ → bucket[2]=3 → [5,4,3,0] ✅

// pick 3 → bucket[3]=3 → [5,4,3,3] ✅

// pick 2 → goes into bucket[2]=5 → [5,4,5,3] ✅

// pick 2 → goes into bucket[3]=5 → [5,4,5,5] ✅

// pick 1 → goes into bucket[1]=5 → [5,5,5,5] ✅

// base case hit → true

        
    
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        
        if (totalSum % k != 0) return false;
        int target = totalSum / k;
        
        // Sort ascending
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[n - 1] > target) return false; // largest number > target → impossible
        
        int[] buckets = new int[k];
        return backtrack(nums, n - 1, buckets, target);
    }

    private boolean backtrack(int[] nums, int index, int[] buckets, int target) {
        if (index < 0) {
            // check all buckets full
            for (int b : buckets) {
                if (b != target) return false;
            }
            return true;
        }

        // 5,4,3,3,2,2,1
        // 5,
        
        int num = nums[index];
        for (int i = 0; i < buckets.length; i++) {
            // try to put num in bucket[i]
            if (buckets[i] + num <= target) {
                buckets[i] += num;
                
                if (backtrack(nums, index - 1, buckets, target)) {
                    return true;
                }
                
                buckets[i] -= num; // backtrack
            }
            
            // important pruning:
            if (buckets[i] == 0) break; 
            // if bucket empty and it didn't work → no point trying other empty buckets
        }
        return false;
    }
}