/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let cnt = 0;

    let balance = 0;
    for (let i = 0; i < s.length; i++) {
        balance += (s[i] === 'L') ? 1 : -1;
        if (balance === 0) cnt++;
    }

    return cnt;
};
