import java.util.*;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int left = 0;

        for(int right = 0; right < n; right++){

            // 1. Remove smaller elements
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[right]){
                dq.pollLast();
            }

            dq.addLast(right);

            // 2. Remove out-of-window
            if(dq.peekFirst() < left){
                dq.pollFirst();
            }

            // 3. Window of size k reached
            if(right - left + 1 == k){

                result[left] = nums[dq.peekFirst()];
                left++;
            }
        }

        return result;
    }
}