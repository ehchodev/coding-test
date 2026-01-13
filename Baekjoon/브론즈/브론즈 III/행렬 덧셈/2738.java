import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < N; a++) {
            st = new StringTokenizer(br.readLine());
            for (int b = 0; b < M; b++) {
                sb.append(arr[a][b] + Integer.parseInt(st.nextToken())).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
