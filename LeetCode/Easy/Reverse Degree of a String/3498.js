/**
 * @param {string} s
 * @return {number}
 */
var reverseDegree = function(s) {
    let sum = 0;
    for (let i = 0; i < s.length; i++) {
        const index = s.charCodeAt(i) - 97;
        sum += (26 - index) * (i + 1);
    }
    return sum;
};
