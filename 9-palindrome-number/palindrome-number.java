class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;

        var i = 0; // i will hold opposite of x like 12 then here 21
        var res = x; // it will be zero at the end
        while(res!=0){
           i = (i*10) + (res%10);
           res= res/10;
        }
        return x==i;
        
    }
}