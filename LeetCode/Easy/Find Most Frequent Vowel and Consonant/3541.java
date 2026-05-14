class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) arr[c - 'a']++;

        int maxVowel = 0, maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (isVowel(c)) {
                maxVowel = Math.max(maxVowel, arr[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, arr[i]);
            }
        }

        return maxVowel + maxConsonant;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
