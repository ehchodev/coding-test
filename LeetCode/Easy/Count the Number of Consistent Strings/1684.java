class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for (char a : allowed.toCharArray()) isAllowed[a - 'a'] = true;

        int count = words.length;
        for (String word : words) {
            for (char w : word.toCharArray()) {
                if (!isAllowed[w - 'a']) {
                    count--;
                    break;
                }
            }
        }
        
        return count;
    }
}
