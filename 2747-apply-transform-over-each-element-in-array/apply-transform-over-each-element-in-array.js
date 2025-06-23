/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const transformedArr = [];

    // call the funciton at each index
    // efficient method
    arr.forEach ( (element,index) =>
    {
        transformedArr[index] = fn(element, index);

    }

    );
    return transformedArr;
    
};