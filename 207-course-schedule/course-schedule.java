class Solution {
    // b first then a
    // deadlock then impossible
    // topology sorting
    // [1,0] == graphs at right 0->1, 
    // indegree of 0 is 1, indegree of 1 is 0
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            int a = p[0], b = p[1];
            graph.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        int processed = 0;

        while (!q.isEmpty()) {
            int course = q.poll();
            processed++;

            for (int next : graph.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        return processed == numCourses;
    }
}