function eraseOverlapIntervals(intervals: number[][]): number {
    // sort by last time
    intervals.sort( (a,b) => a[1] - b[1] );
    let removed=0;
    let lastEndTime= -10 * 10 * 10 * 10 * 9;
    for ( let i=0 ;i <intervals.length; i++){
        const interval = intervals[i];
        const start = interval[0];
        const end = interval[1];
        if ( start>= lastEndTime){
            lastEndTime = end; // no overlap
        }
        else {
            removed+=1;
        }

    }

    return removed;
    
};