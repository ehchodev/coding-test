import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int max = 0;
        String pos = "1 1";
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    pos = (i + 1) + " " + (j + 1);
                }
            }
        }
        
        System.out.println(max);
        System.out.print(pos);
    }
}
