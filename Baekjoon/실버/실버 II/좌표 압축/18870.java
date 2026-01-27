import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < N; j++) {
            if (!map.containsKey(arr2[j])) map.put(arr2[j], map.size());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        
        System.out.print(sb);
    }
}
