import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int min = 1000000;
        int max = 2;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        
        System.out.print(min * max);
    }
}
