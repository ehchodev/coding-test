class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int f : friends) set.add(f);

        List<Integer> list = new ArrayList<>();
        for (int n : order) {
            if (set.contains(n)) list.add(n);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);

        return arr;
    }
}
