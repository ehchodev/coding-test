import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        int cnt = 0;
        while (N-- > 0) {
            String s = br.readLine();
            if ("ENTER".equals(s)) {
                cnt += set.size();
                set = new HashSet<>();
            } else {
                set.add(s);
            }
        }
        
        cnt += set.size();
        System.out.print(cnt);
    }
}
