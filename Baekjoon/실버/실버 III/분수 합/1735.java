import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numer1 = Integer.parseInt(st.nextToken());
        int denom1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int numer2 = Integer.parseInt(st.nextToken());
        int denom2 = Integer.parseInt(st.nextToken());
        
        int sumNumer = (numer1 * denom2) + (numer2 * denom1);
        int sumDenom = denom1 * denom2;
        
        int gcd = getGCD(sumNumer, sumDenom);
        sumNumer /= gcd;
        sumDenom /= gcd;
        
        System.out.print(sumNumer + " " + sumDenom);
    }
    
    public static int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }
}
