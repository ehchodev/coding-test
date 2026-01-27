import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        
        Arrays.sort(arr, (a, b) -> {
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });
        
        StringBuilder sb = new StringBuilder();
        for (String[] s : arr) {
            sb.append(s[0]).append(" ").append(s[1]).append("\n");
        }
        
        System.out.print(sb);
    }
}
