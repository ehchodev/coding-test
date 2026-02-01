import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int max = 123456 * 2;
        boolean[] arr = new boolean[max + 1];
        arr[0] = arr[1] = true;
        for (int i = 2; i * i <= max; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= max; j += i) {
                    arr[j] = true;
                }
            }
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            int cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!arr[i]) cnt++;
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.print(sb);
    }
}
