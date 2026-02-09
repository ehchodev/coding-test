import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        int[] arr = new int[K];
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > 0) {
                sum += n;
                arr[idx++] = n;
            } else {
                sum -= arr[--idx];
            }
        }
        
        System.out.print(sum);
    }
}
