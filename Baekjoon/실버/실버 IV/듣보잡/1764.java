import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            String name = br.readLine();
            if (set.contains(name)) {
                list.add(name);
            }
        }
        
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        
        for (String dbj : list) {
            sb.append(dbj).append("\n");
        }
        
        System.out.print(sb);
    }
}
