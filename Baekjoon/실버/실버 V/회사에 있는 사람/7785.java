import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String input = st.nextToken();
            
            if ("enter".equals(input)) set.add(name);
            else set.remove(name);
        }
        
        List<String> list = new ArrayList<>(set);
        
        list.sort(Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < list.size(); j++) {
            sb.append(list.get(j)).append("\n");
        }
        
        System.out.print(sb);
    }
}
