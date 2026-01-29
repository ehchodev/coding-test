import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        long gcd = getGCD(A, B);
        long lcm = (A / gcd) * B;
        System.out.print(lcm);
    }
    
    public static long getGCD(long a, long b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }
}
