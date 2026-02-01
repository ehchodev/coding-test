import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        int gcd = arr[1] - arr[0];
        for (int j = 1; j < N - 1; j++) {
            gcd = getGCD(arr[j + 1] - arr[j], gcd);
        }
        
        int cnt = (arr[N - 1] - arr[0]) / gcd + 1;
        System.out.print(cnt - N);
    }
    
    public static int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }
}
