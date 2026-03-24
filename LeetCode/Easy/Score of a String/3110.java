class Solution {
    public int scoreOfString(String s) {
        int output = 0;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            output += Math.abs(arr[i] - arr[i + 1]);
        }

        return output;
    }
}
