class Solution {
    public char kthCharacter(long k, int[] operations) {
/*
aa, 2,, 0
aabb, 4,, 1
aabbaabb, 8,, 0
aabb aabb bccb bcc, 16,,, 1
16 -> 10th
8 -> 10 - 8 -> 2, shift = 1, character = b
4 -> 2, k is not greater than half
2 -> 2 -2 -> 0, shift = 1, character = b */
// Divide the length by 2, problem -> sub problem
    int shifts = 0;
    long length = 1;

    for(int i=0; i< operations.length; i++){
        // everytime length increase by multiple of 2
        length*=2; 

        // if length >=k
        if ( length >= k ) 
        {
            for( int j = i; j >=0; j-=1)
            {
                long half = length/2;
                // if k is greater than  the half, right side lying
                if ( k > half){
                    k-=half;
                    if( operations[j] == 1){
                     shifts +=1 ;
                    }
                }

               length/=2;
            }

            break;

        }
    }

    return (char)( ( shifts % 26 ) + 'a' );
    }
}