import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == -1) break;
            
            int sum = 1;
            String s = n + " = 1";
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    
                    if (sum > n) break;
                    
                    s += " + " + i;
                }
            }
            
            if (sum != n) {
                sb.append(n + " is NOT perfect.\n");
            } else {
                sb.append(s + "\n");
            }
        }
        
        System.out.print(sb);
    }
}
