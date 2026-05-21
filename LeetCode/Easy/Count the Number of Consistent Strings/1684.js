/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    const set = new Set(allowed);
    let count = words.length;

    for (const word of words) {
        for (const w of word) {
            if (!set.has(w)) {
                count--;
                break;
            }
        }
    }

    return count;
};
