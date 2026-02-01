import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        boolean[] arr = new boolean[M + 1];
        arr[0] = arr[1] = true;
        
        for (int i = 2; i <= Math.sqrt(M); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j <= M; j += i) arr[j] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = N; i <= M; i++) {
            if (!arr[i]) sb.append(i).append("\n");
        }
        
        System.out.print(sb);
    }
}
