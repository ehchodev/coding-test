/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    const vowel = new Set(['a', 'e', 'i', 'o', 'u']);
    const arr = new Int32Array(26);
    for (let i = 0; i < s.length; i++) arr[s.charCodeAt(i) - 97]++;

    let maxVowel = 0, maxConsonant = 0;
    for (let i = 0; i < 26; i++) {
        const c = String.fromCharCode(i + 97);
        if (vowel.has(c)) {
            maxVowel = Math.max(maxVowel, arr[i]);
        } else {
            maxConsonant = Math.max(maxConsonant, arr[i]);
        }
    }

    return maxVowel + maxConsonant;
};
