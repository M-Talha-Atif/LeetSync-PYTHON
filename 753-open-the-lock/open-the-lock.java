class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000")) return -1;

        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String curr = q.poll();

                if (curr.equals(target)) return steps;
                if (dead.contains(curr)) continue;

                for (String next : getNeighbors(curr)) {
                    if (!visited.contains(next) && !dead.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            steps++;
        }

        return -1;
    }

    private List<String> getNeighbors(String s) {
        List<String> neighbors = new ArrayList<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < 4; i++) {
            char c = arr[i];

            char up = c == '9' ? '0' : (char)(c + 1);
            char down = c == '0' ? '9' : (char)(c - 1);

            arr[i] = up;
            neighbors.add(new String(arr));

            arr[i] = down;
            neighbors.add(new String(arr));

            arr[i] = c; // restore
        }

        return neighbors;
    }
}
