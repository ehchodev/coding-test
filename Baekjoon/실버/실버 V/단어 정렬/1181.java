import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        
        Arrays.sort(arr, (a, b) -> {
           if (a.length() == b.length()) {
               return a.compareTo(b);
           } else {
               return a.length() - b.length();
           }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append("\n");
        }
        
        System.out.print(sb);
    }
}
