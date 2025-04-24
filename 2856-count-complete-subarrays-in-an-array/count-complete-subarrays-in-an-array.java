class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> data = new HashSet<Integer>();
        
        
        for(int num : nums){
            data.add(num);
        }

        int dLength = data.size();

        return atMostK(nums,dLength ) - atMostK(nums,dLength - 1);
      
        
    }

    public int atMostK(int[] nums, int k){


        int left = 0;
        int count = 0;
        int numsLength = nums.length;

        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();

        for(int right =0; right< numsLength; right++){


            temp.put(nums[right], temp.getOrDefault(nums[right],0) + 1);

            while( temp.size() > k && left<=right ){
        
              

                temp.put(nums[left], temp.getOrDefault(nums[left],0) - 1);

                if  (temp.get(nums[left]) == 0){
                    temp.remove(nums[left]);
                }

                left+=1;

            }


            count += (right - left + 1);

            

        }

        return count;

    }


}