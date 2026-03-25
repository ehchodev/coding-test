/**
 * @param {string} s
 * @return {number}
 */
var scoreOfString = function(s) {
    return [...s].reduce((acc, _, i) => 
            (i < s.length - 1) ? acc + Math.abs(s.charCodeAt(i) - s.charCodeAt(i + 1)) : acc, 0);
};
