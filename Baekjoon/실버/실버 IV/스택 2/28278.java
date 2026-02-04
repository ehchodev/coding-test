import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        int[] stk = new int[N];
        
        int idx = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            
            switch (cmd) {
                case 1:
                    int X = Integer.parseInt(st.nextToken());
                    stk[idx++] = X;
                    break;
                case 2:
                    sb.append(idx == 0 ? -1 : stk[--idx]).append("\n");
                    break;
                case 3:
                    sb.append(idx).append("\n");
                    break;
                case 4:
                    sb.append(idx == 0 ? 1 : 0).append("\n");
                    break;
                case 5:
                    sb.append(idx == 0 ? -1 : stk[idx - 1]).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
    }
}
