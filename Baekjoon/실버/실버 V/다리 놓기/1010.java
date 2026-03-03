import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int max = 30;
        int[][] dp = new int[max + 1][max + 1];
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { dp[i][j] = 1; }
                else { dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]; }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(dp[M][N]).append("\n");
        }
        
        System.out.print(sb);
    }
}
