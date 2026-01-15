import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = N;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < min) min = i;
            }
        }
        
        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.print(sum + "\n" + min);
        }
    }
    
    static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        
        for (int a = 2; a <= Math.sqrt(num); a++) {
            if (num % a == 0) return false;
        }
        
        return true;
    }
}
