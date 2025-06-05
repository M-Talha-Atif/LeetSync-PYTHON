class Solution {
    public boolean lemonadeChange(int[] bills) {

        int count5s = 0;
        int count10s=0;

    for (int bill : bills) {

        if (bill == 5){
            count5s+=1;
        }
        else if (bill == 10){
           count5s-=1;
           count10s+=1;
        }

      
        else if (count10s>0){
                count10s-=1;
                count5s-=1;
        }
        else {
                count5s-=3;
        }
        if (count5s<0) {
                return false;
        }

        }


  


       return true;

        
    }
}