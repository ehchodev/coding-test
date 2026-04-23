class Solution {
    public int mirrorDistance(int n) {
        int rn = Integer.parseInt(new StringBuilder(n + "").reverse().toString());
        int cal = Math.abs(n - rn);
        return cal;
    }
}
