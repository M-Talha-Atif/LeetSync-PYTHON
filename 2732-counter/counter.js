/**
 * @param {number} n
 * @return {Function} counter
 */
 
var createCounter = function(n) {
    let counter = n-1;
    
    return function() {
        // has access from createCounter function scope
        counter++;
        return counter;
        
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */