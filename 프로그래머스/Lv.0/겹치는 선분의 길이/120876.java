import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        String[] arr1 = new String[lines[0][1] - lines[0][0]];
        String[] arr2 = new String[lines[1][1] - lines[1][0]];
        String[] arr3 = new String[lines[2][1] - lines[2][0]];
        
        int idx1 = 0, idx2 = 0, idx3 = 0;
        for (int i1=lines[0][0]; i1<lines[0][1]; i1++) {
            arr1[idx1] = i1 + "," + (i1+1);
            hmap.put(arr1[idx1], hmap.getOrDefault(arr1[idx1], 0)+1);
            idx1++;
        }
        for (int i2=lines[1][0]; i2<lines[1][1]; i2++) {
            arr2[idx2] = i2 + "," + (i2+1);
            hmap.put(arr2[idx2], hmap.getOrDefault(arr2[idx2], 0)+1);
            idx2++;
        }
        for (int i3=lines[2][0]; i3<lines[2][1]; i3++) {
            arr3[idx3] = i3 + "," + (i3+1);
            hmap.put(arr3[idx3], hmap.getOrDefault(arr3[idx3], 0)+1);
            idx3++;
        }
        
        for (String key : hmap.keySet()) {
            if (hmap.get(key) > 1) answer++;
        }
        
        return answer;
    }
}
