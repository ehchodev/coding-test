import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[20000001];
        for (int i = 0; i < N; i++) {
            int num1 = Integer.parseInt(st.nextToken());
            arr[10000000 + num1]++;
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            int num2 = Integer.parseInt(st.nextToken());
            sb.append(arr[10000000 + num2]).append(" ");
        }
        
        System.out.print(sb);
    }
}
