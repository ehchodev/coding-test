import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int max = 1000000;
        boolean[] arr = new boolean[max + 1];
        arr[0] = arr[1] = true;
        for (int i = 2; i * i <= max; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= max; j += i) {
                    arr[j] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            int cnt = 0;
            for (int a = 2; a <= N / 2; a++) {
                if (!arr[a] && !arr[N - a]) cnt++;
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.print(sb);
    }
}
