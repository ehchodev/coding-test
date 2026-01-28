import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < A; i++) set.add(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int j = 0; j < B; j++) {
            if (set.contains(st.nextToken())) count++;
        }
        
        System.out.print(A + B - (count * 2));
    }
}
