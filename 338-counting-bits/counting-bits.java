class Solution {
    public int[] countBits(int n) {

        int[] data = new int[n+1];

        for(int num=0; num<n+1; num+=1){
            data[num] = hammingWeight(num);
        }

        return data; 
    }

      public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            n &= (n-1);
          
            c+=1;
        }
        return c;

        // 101, 100
        // 100, 011
        // 000
        
    }
}