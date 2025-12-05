class Solution {
    public int countPartitions(int[] nums) {
    int total= 0;
    for ( int num: nums){
        total+= num;
    }
    // 36
    // 
    int leftSum=0;

    int partitions = 0;
    for ( int i =0; i<nums.length-1; i++){
        int num = nums[i];
        leftSum += num;
        int rightSum = total - leftSum;
        int diff = ( leftSum - rightSum);
        if ( diff % 2 == 0){
            partitions+=1;
        }
    }

    return partitions;
        
    }
}