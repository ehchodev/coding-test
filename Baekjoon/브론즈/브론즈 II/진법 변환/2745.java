import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        long sum = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if (!Character.isDigit(c)) {
                sum += (c - 'A' + 10) * (int) Math.pow(B, N.length() - i - 1);
            } else {
                sum += (c - '0') * (int) Math.pow(B, N.length() - i - 1);
            }
        }
        
        System.out.print(sum);
    }
}
