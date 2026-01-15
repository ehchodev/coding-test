import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String s = br.readLine();
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int cnt = 0;
        for(int num : arr) {
            if (isPrime(num)) cnt++;
        }
        
        System.out.print(cnt);
    }
    
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}
