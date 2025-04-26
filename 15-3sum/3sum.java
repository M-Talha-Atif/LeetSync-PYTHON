class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        if(nums.length < 3 || nums[0]>0){    //Base case 
            return result;
        }

        int n = nums.length;

        

        // Loop over array

        for(int i=0; i<n; i++) {
            // agy saray positive
              if(nums[i] > 0){     
                break;
            }
            //If number is getting repeated, ignore the lower loop and continue.

            if(i > 0 && nums[i] == nums[i - 1]){    
                continue;
            }
            int left = i+1;
            int right = n-1;

            while(left<right){
                int target = nums[i] + nums[left] + nums[right];

                if( target ==0){
                    List<Integer> threeNumbers = new ArrayList<>();
                    threeNumbers.add(nums[i]);
                    threeNumbers.add(nums[left]);
                    threeNumbers.add(nums[right]);

                    result.add(threeNumbers);

                    int lefty = nums[left];
                    int righty = nums[right];

                    // skip left and right duplicates
                    while(left<right && lefty == nums[left+1]) left+=1;
                    while(left<right && righty == nums[right-1]) right-=1;

                    right-=1;
                    
                }
                else if( target >0){ right-=1;}
                else {
                    left+=1; // result < 0
                }
            }


        }


        return result;


        
    }
}