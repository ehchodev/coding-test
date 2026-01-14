import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        char c;
        while (N > 0) {
            if (N % B >= 10) {
                c = (char) (N % B - 10 + 'A');
            } else {
                c = (char) (N % B + '0');
            }
            sb.append(c);
            
            N /= B;
        }
        
        System.out.println(sb.reverse());
    }
}
