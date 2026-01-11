import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i)).append("*".repeat(2 * i - 1)).append("\n");
        }
        
        for (int j = N - 1; j > 0; j--) {
            sb.append(" ".repeat(N - j)).append("*".repeat(2 * j - 1)).append("\n");
        }
        
        System.out.println(sb);
    }
}
