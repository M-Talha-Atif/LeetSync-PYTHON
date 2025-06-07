class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
int n = trips.length;
ArrayList<int[]> tripsData = new ArrayList<>();

for (int i = 0; i < n; i++) {
    int[] trip = trips[i];
    int passengers = trip[0];
    tripsData.add(new int[]{trip[1], passengers});  
    tripsData.add(new int[]{trip[2], -passengers});  
}

// Sort by location, if same then sort by passengers
tripsData.sort((a, b) -> {
     if (a[0] == b[0]){
        // passenger
       return a[1] - b[1];
     }
     else {
        // location
       return a[0] - b[0];
     }


} );

int current = 0;
for (int[] item : tripsData) {
    current += item[1];
    if (current > capacity) {
        return false;
    }
}

        return true;
    }
}