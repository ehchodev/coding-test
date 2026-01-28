import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int M = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append( (Arrays.binarySearch(arr, num) >= 0) ? 1 : 0 ).append(" ");
        }
        
        System.out.print(sb);
    }
}
