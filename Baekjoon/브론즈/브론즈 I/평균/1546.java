import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] scores = new int[N];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            scores[i] = score;
            
            if (score > max) max = score;
        }
        
        double sum = 0;
        for (int score : scores) {
            sum += (double) score / max * 100;
        }
        
        System.out.println((double) sum / N);
    }
}
