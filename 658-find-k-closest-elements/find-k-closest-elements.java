class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

    
        // 1,2,3,4,5
        int start = 0;
        int end = arr.length - 1;
        // data sorted so can skip elements from right end or left end
        while(end - start >=k ) 
        
        {
            if(Math.abs(x - arr[start]) > Math.abs(x - arr[end]))
            
            {
                start +=1;
            }
            // equal then skip from right as right greater than left due to sorted data
            else {
                end-=1;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }

        return result;

        
    }
}