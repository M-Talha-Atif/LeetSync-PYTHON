/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(originalValue) {

    return {
        toBe: function(newVal) {
			if (newVal !== originalValue) {
				throw new Error("Not Equal")
			} else return true },
		notToBe: function(newVal) {
			if (newVal === originalValue) {
				throw new Error("Equal")
			} else return true 
		}
	}
    
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */