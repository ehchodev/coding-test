import java.io.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        sb.append((int) Math.pow(2, N) - 1).append("\n");
        
        hanoi(N, 1, 2, 3);
        
        System.out.print(sb);
    }
    
    static void hanoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }
        
        hanoi(n - 1, start, to, mid);
        
        sb.append(start).append(" ").append(to).append("\n");
        
        hanoi(n - 1, mid, start, to);
    }
}
