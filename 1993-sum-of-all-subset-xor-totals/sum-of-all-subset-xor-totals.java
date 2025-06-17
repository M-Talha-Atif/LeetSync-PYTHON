class Solution {

/* 
OR batata hai: "Kaunse bits ka contribution hai."

2^(n-1) batata hai: "Har contributing bit kitni baar aayegi."

Multiply karke hum sab bits ka total sum nikal lete hain.

1,3,5 -> 01, 11, 101

001, 011, 101 -> OR -> 111

2,4 -> 010, 100 -> OR -> 110
*/

    // List<List<Integer>> result;

    public int subsetXORSum(int[] nums) {

        int totalSum=0;
        for(int num : nums){
            totalSum|= num;
        }
        // int power = 1 << (n-1);  // 2^(n-1)
        // 1<<2 is 4, 1<<3 is 8
        // << this is left shift for power of 2
        int n = nums.length;

        return totalSum *   ( 1 << (n-1) );

        // result = new ArrayList<>();

        //    // take, explore, not take, explore
        // solve(nums, 0, new ArrayList<>());

        // int total = 0;

        // for(List<Integer> items : result){
        //     int temp = 0;
        //     for (int item : items){
        //         temp ^= item;
        //     }
        //     total+=temp;
        // }

        // return total;

        
    }

    // public void solve(int[] nums, int index, List<Integer> temp ){
    //     result.add(new ArrayList<>( temp ));

    //     for(int i=index; i<nums.length; i+=1){
    //         temp.add(nums[i]); // take

    //         solve(  nums, i + 1, temp); // process

    //         temp.remove( temp.size() - 1 ); // remove again explore
    //     }
    // }
}