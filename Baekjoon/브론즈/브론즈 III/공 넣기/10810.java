import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] baskets = new int[N];
        for (int num = 0; num < M; num++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            while (i <= j) {
                baskets[i - 1] = k;
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : baskets) {
            sb.append(num).append(" ");
        }
        
        System.out.println(sb);
    }
}
