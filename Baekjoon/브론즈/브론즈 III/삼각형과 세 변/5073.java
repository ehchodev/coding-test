import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) break;
            
            String s = "";
            
            int sum = a + b + c;
            int max = Math.max(a, Math.max(b, c));
            if (sum - max <= max) {
                s = "Invalid";
            
            } else {
                if (a == b && b == c && c == a) {
                    s = "Equilateral";
                } else if (a == b || b == c || c == a) {
                    s = "Isosceles";
                } else {
                    s = "Scalene";
                }
            }
            
            sb.append(s).append("\n");
        }
        
        System.out.print(sb);
    }
}
