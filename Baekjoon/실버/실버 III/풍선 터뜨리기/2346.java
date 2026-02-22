import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.add(new int[] {i + 1, Integer.parseInt(st.nextToken())});
        }
        
        StringBuilder sb = new StringBuilder();
        int[] p = deque.pollFirst();
        sb.append(p[0]);
        
        while (!deque.isEmpty()) {
            int move = p[1];
            
            if (move > 0) {
                for (int j = 0; j < move - 1; j++) {
                    deque.addLast(deque.pollFirst());
                }
                p = deque.pollFirst();
            } else {
                for (int j = 0; j < (move * -1) - 1; j++) {
                    deque.addFirst(deque.pollLast());
                }
                p = deque.pollLast();
            }
            
            sb.append(" ").append(p[0]);
        }
        
        System.out.print(sb);
    }
}
