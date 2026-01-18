import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int sum = a + b + c;
        if (a != b || b != c || c != a) {
            int max = Math.max(a, Math.max(b, c));
            if (sum - max <= max) {
                sum = (sum - max) * 2 - 1;
            }
        }
        
        System.out.print(sum);
    }
}
