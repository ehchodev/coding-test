import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int idx = -1;
        for (int j = 0; j < N; j++) {
            int cnt = 0;
            
            while (cnt < K) {
                idx++;
                if (arr[idx % N] != 0) cnt++;
            }
            
            sb.append(arr[idx % N]);
            arr[idx % N] = 0;
            
            if (j < N - 1) sb.append(", ");
        }
        
        sb.append(">");
        System.out.print(sb);
    }
}
