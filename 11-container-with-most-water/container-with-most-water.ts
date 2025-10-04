function maxArea(height: number[]): number {
    let left = 0;
    let right = height.length - 1;
    // width right - left
    // height is current element
    let area= 0;
    let maxArea=0;
    while ( left < right ) {
        let heightDiff = Math.min( height[left], height[right]);
        let width = right - left;
        area = heightDiff  * width;
        maxArea = Math.max( area, maxArea);
        // trap by minimum
        // 8,7 --> 7
        if ( height[right] > height[left] ){
            left+=1;
        }
        else {
            right-=1;
        }
    }

    return maxArea;
    
};