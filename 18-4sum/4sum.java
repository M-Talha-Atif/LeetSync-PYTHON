class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> myResult = new ArrayList<>();


        // a+b+c == 0, a+b+c=-d
        int n = nums.length;

        if(n<4){
            return myResult;
        }


       // sort the array
        Arrays.sort(nums);

        for(int i=0; i < n; i++){

    
            if(i>0 && nums[i-1] == nums[i]){
                continue; // a duplicate
            }


            for(int j=i+1; j < n ; j++){


        
            // why skipping this
            // -5,-4, 10,20 skipp as target let say is 30
            // -5-4 + 10 + 20 is 21 so skip this, pre condition based skip
            // pruning
            if(nums[i]+nums[j]+nums[n-1]+nums[n-2]<target)continue;

            if(j>i+1 && nums[j-1] == nums[j]){
                continue; // b duplicate
            }

            int left = j+1;
            int right = n-1;

            while(left < right){

                long totalSum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];


                if(totalSum>target){
                    right-=1;
                }
                else if(totalSum<target){
                    left+=1;
                }
                else { // found quadrlet

               Integer lefty = nums[left];
               Integer righty = nums[right];

               myResult.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

               int temp = nums[left];

               // c duplicate
               while(left<right && temp==nums[left+1]){
                left+=1;
               }
              // d duplicate
              while(left<right && nums[right]==nums[right-1]){
                right-=1;
               }
               // to move for further quadrlets
               // two fixed numbers, so move both pointers to avoid duplicate
               left+=1;
               right-=1;
          
                }

                
            }

            }
            
            

        }

        return myResult;


        
    }
}