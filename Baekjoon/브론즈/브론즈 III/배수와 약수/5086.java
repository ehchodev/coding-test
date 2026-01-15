import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String s = "";
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if (A == 0 && B == 0) break;
            
            if (B % A == 0) {
                s = "factor";
            } else if (A % B == 0) {
                s = "multiple";
            } else {
                s = "neither";
            }
            
            sb.append(s).append("\n");
        }
        
        System.out.print(sb);
    }
}
