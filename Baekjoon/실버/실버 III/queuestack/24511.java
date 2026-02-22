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
        
        Deque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[j] != 0) continue;
            deque.addFirst(num);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < M; k++) {
            int num2 = Integer.parseInt(st.nextToken());
            deque.addLast(num2);
            sb.append(deque.pollFirst()).append(" ");
        }
        
        System.out.print(sb);
    }
}
