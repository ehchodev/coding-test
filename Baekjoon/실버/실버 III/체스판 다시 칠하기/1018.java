import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        
        boolean[][] arr = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            String s = br.readLine();
            for (int j = 0; j < col; j++) {
                arr[i][j] = (s.charAt(j) == 'W');
            }
        }
        
        int min = 64;
        for (int a = 0; a <= row - 8; a++) {
            for (int b = 0; b <= col - 8; b++) {
                int cnt = 0;
                boolean flag = true;
                
                for (int c = a; c < a + 8; c++) {
                    for (int d = b; d < b + 8; d ++) {
                        if (arr[c][d] != flag) cnt++;
                        flag = !flag;
                    }
                    flag = !flag;
                }
                
                min = Math.min(min, Math.min(cnt, 64 - cnt));
            }
        }
        
        System.out.print(min);
    }
}
