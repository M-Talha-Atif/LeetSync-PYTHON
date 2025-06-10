class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        class Project {
            int capital;
            int profit;
            Project(int profit, int capital){
                this.capital = capital;
                this.profit = profit;
            }
        }
        int n = profits.length;
        List<Project> projects = new ArrayList<>();

        for(int i=0; i<n; i+=1){
            projects.add(new Project(profits[i], capital[i]));
        }

        projects.sort( (a,b) -> a.capital - b.capital );

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> b-a );
        int i=0;

        for(int j=0; j<k; j++)
        {

            // store the projects in heap that becomes available at capital we have
            while( i < n && projects.get(i).capital <=w ){
                maxHeap.offer( projects.get(i).profit );
                i+=1;
            }

            if (maxHeap.isEmpty()){ // got no project
                break;
            }

            w+= maxHeap.poll(); // get maximum profit project

        }

        return w;



    }
}