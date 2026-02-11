import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int arrIdx = 0;
        int nextNum = 1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (num == nextNum) {
                nextNum++;
            } else {
                arr[arrIdx++] = num;
            }
            
            while (arrIdx > 0 && arr[arrIdx - 1] == nextNum) {
                arrIdx--;
                nextNum++;
            }
        }
        
        System.out.print( (arrIdx == 0) ? "Nice" : "Sad");
    }
}
