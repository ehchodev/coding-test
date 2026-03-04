import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            
            if (set.contains(s1)) set.add(s2);
            else if (set.contains(s2)) set.add(s1);
        }
        
        System.out.print(set.size());
    }
}
