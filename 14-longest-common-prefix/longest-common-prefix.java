class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String startString = strs[0];
        String endString = strs[strs.length-1];
        for (int i=0; i<Math.min(startString.length(), endString.length()); i++) {

            if (startString.charAt(i) != endString.charAt(i)) {
                return res.toString();
            }
            res.append(startString.charAt(i));
        }
        return res.toString();
        
    }
}