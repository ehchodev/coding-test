/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    for (let i = 0; i < s.length; i++) {
        if (s[i] === ' ') {
            k--;

            if (k === 0) {
                s = s.slice(0, i);
                break;
            }
        }
    }

    return s;
};
