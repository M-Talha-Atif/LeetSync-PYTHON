class Solution {
    public String triangleType(int[] nums) {
        
       
        Arrays.sort(nums);
        Set<Integer> data = new HashSet<>();
        for (int num : nums) data.add(num);

        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (data.size() == 1) return "equilateral";
        if (data.size() == 2) return "isosceles";

        return "scalene";

        
    }
}