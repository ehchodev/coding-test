class Solution {
    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;

                if (k == 0) {
                    s = s.substring(0, i);
                    break;
                }
            }
        }

        return s;
    }
}
