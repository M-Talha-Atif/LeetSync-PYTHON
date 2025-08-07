class NumArray {

    int total[];

    public NumArray(int[] nums) {
        int rows = nums.length;
        total = new int[rows];
        // prefix sum 
        total[0] = nums[0];
        for (int row = 1; row < rows; row++){
           total[row] = total[row-1] + nums[row];
        }
        
    }
    
    public int sumRange(int left, int right) {
        // System.out.println(total[right]);
        if(left == 0) {
        return total[right];
    } else {
        return total[right] - total[left - 1];
    }
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */