import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for (int num = 0; num < N; num++) {
            arr[num] = num + 1;
        }
        
        for (int num = 0; num < M; num++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            if (i == j) continue;
            
            int[] arr2 = Arrays.copyOfRange(arr, i - 1, j);
            for (int num2 = 0; num2 < arr2.length; num2++) {
                arr[i + num2 - 1] = arr2[arr2.length - num2 - 1];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        
        System.out.println(sb);
    }
}
