import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for (String s : S.split("")) {
                sb.append(s.repeat(R));
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
