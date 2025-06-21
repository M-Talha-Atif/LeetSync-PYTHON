class Solution {
        // a->4, b->2, c->1
        // 4-2 = 2
        // 4-1 = 3
        // 4, 2, 1 --> 2,2

        //d->5, a->1, c->3
        // 5,3,1 --> 5-3 is 2, if next characters less than 2, then delete them?

        // aabbcc, k = 0
        // no deletion needed
        // aabbccdd -> k=1, no deletion
        // aaaabbbbcc k=1
        //
       public int minimumDeletions(String word, int k) {
        int res = 100000, data[] = new int[26];
        for (char c : word.toCharArray()) {
            data[c - 'a']++;
        }
        for (int x : data) {
            int cur = 0;
            for (int a : data) {
                cur += (a < x) ? a : Math.max(0, a - (x + k));
            }
            res = Math.min(res, cur);
        }
        return res;
    }
}