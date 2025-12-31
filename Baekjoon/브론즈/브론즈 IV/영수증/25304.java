import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totPrice = Integer.parseInt(br.readLine());
        int TotCnt = Integer.parseInt(br.readLine());
        
        int sum = 0;
        for (int i = 0; i < TotCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }
        
        String result = "No";
        if (totPrice == sum) {
            result = "Yes";
        }
        
        System.out.println(result);
    }
}
