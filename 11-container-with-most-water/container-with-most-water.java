class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        // right - left + 1 is width
        // min of right and left is height
        // where to move pointer?
        // got an idea of problem in 2 minutes after reading it

        int left = 0;
        int right = n-1;
        // as values are positive
        int maxArea = -10;
        while(left < right){
            int h = Integer.min(height[left],height[right]);
            int w = right - left;

            maxArea = Integer.max(h*w, maxArea);
            // want to maximize the area

            if( height[left] < height[right]){
                left+=1; // greedy for big value at right
            }
            else {
                right-=1; // greedy for big value at left
            }


        }

        return maxArea;
        
    }
}