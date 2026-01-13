import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int[][] arr = new int[100][100];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for (int a = x; a < x + 10; a++) {
                for (int b = y; b < y + 10; b++) {
                    arr[a][b]++;
                }
            }
        }
        
        int cnt = 0;
        for (int[] row : arr) {
            for (int col : row) {
                if (col > 0) cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}
