function triangularSum(nums: number[]): number {
    // what is reducing ,size 
    // apply operation
    let size: number = nums.length;
    while ( size>0 )
    { 
        for(let i=0; i <size-1; i++){
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        }
        size-=1;

    }

    return nums[0];

    
};