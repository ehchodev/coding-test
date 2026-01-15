import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if (N != 1) {
            StringBuilder sb = new StringBuilder();
            int num = 2;
            while (N > 1) {
                if (N % num == 0) {
                    sb.append(num).append("\n");
                    N /= num;
                } else {
                    num++;
                }
            }
            
            System.out.print(sb);
        }
    }
}
