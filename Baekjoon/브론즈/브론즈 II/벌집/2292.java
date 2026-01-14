import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        int max = 1;
        for (int i = 1; i < N; i++) {
            if (i == max) {
                max += 6 * cnt;
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}
