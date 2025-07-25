/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // versions are numbered from 1 to n
        int left =1, right = n;
        while ( left < right ) {
            int version = left + ( right - left ) / 2;
            if ( isBadVersion(version)  == true ){
                right = version; // reduce right search space and find first one
            }
            else {
                left = version + 1; // reduce left search space
            }
        }

        return right;
        
    }
}