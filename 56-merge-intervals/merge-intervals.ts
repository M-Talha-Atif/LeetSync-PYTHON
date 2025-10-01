function merge(intervals: number[][]): number[][] {
    intervals.sort( (a,b) => (a[0] -b[0])); // sort by start time
    let result: number[][] = [ intervals[0]];

    // iterate over intervals
    for( let i=1; i< intervals.length; i++){
        const lastAddedIntervalIndex: number  = result.length-1;
        if ( result[lastAddedIntervalIndex][1] >= intervals[i][0] ) {
            result[lastAddedIntervalIndex][1] = Math.max(result[lastAddedIntervalIndex][1], intervals[i][1]); // update the end of added interval to fill up the merge
        }
        else {
            result.push( intervals[i] );
        }
    }

    return result;
    
};