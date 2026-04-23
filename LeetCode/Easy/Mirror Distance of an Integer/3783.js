/**
 * @param {number} n
 * @return {number}
 */
var mirrorDistance = function(n) {
    const rn = parseInt((n + "").split("").reverse().join(""));
    const cal = Math.abs(n - rn);
    return cal;
};
