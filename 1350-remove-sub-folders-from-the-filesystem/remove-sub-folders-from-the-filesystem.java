class Solution {
    public List<String> removeSubfolders(String[] folder) {

        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        System.out.println(folder.toString());
        ans.add(folder[0]);
        for( int i=1; i < folder.length; i+=1 ){
            String last = ans.get( ans.size() - 1 ) + "/";
            String current = folder[i];

            if ( !current.startsWith(last) ) {
                ans.add(  current );
            }

        }

        return ans;
    }
}