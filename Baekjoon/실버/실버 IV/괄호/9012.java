import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int cnt = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    cnt++;
                } else {
                    cnt--;
                    if (cnt < 0) break;
                }
            }
            
            if (cnt == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
