/**
 * @param {number} n
 * @return {number}
 */
var totalMoney = function(n) {
  const w = Math.floor(n / 7);
  const r = n % 7;
  return 28 * w + (7 * w * (w - 1)) / 2 + r * (w + 1) + (r * (r - 1)) / 2;
    
};