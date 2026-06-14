class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;

        int[] idxArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            idxArr[s.charAt(i) - 'a'] = i;
        }

        for (int j = 0; j < t.length(); j++) {
            sum += Math.abs(j - idxArr[t.charAt(j) - 'a']);
        }

        return sum;
    }
}
