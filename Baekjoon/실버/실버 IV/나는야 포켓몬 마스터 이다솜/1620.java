import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numberMap = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            numberMap.put(i, name);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            String q = br.readLine();
            if (Character.isDigit(q.charAt(0))) {
                sb.append(numberMap.get(Integer.parseInt(q))).append("\n");
            } else {
                sb.append(nameMap.get(q)).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
