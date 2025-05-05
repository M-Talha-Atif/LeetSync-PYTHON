class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 1 ,3 , 4 , 2


        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // add decreasing sub sequence
        // like 8 5 4 3 2 1 6, now 6 occured so get 1,2,3,4,5 as keys and their values as 6
        // 1 3 4 2 , map is like 1 -> 3, 3

        for (int n : nums2 ) {

            while(!stack.isEmpty() && n > stack.peek() ) {

                map.put( stack.pop(), n); // key - value
            }
            // add in stack
            stack.push(n);

        }

        System.out.println(map);

        for(int i=0 ; i < nums1.length ; i+=1) {


            nums1[i]  = map.getOrDefault( nums1[i], -1 );
        }

        return nums1;






        
    }
}