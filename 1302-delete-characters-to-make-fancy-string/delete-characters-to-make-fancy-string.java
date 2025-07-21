class Solution {
    public String makeFancyString(String s) {
        /*
        count reset on unmatched
        pick one more if count < 2 and character gets comapred with previous one
count keep on increasing, only add when count < 2, it will automatically
reset when unmatched character come in string

aaaa -> only pick 2, count will keep on increasing and will become 1 and prev
character also get changed with unmatched */
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int index = 1;
        int count = 1;
        char prev = s.charAt(0);
        res.append(prev);
        while (index < n)
        {   
            if ( prev == s.charAt(index) ){
                count+=1;
                if ( count < 3){
                    res.append(  s.charAt(index) ) ;
                }
            }
            else {
                prev = s.charAt(index);
                count=1;
                res.append(  s.charAt(index) ) ;

            }
           index++;
            
        }

        return res.toString();
        
    }
}