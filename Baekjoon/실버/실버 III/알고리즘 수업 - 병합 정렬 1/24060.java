import java.io.*;
import java.util.*;

class Main {
    static int[] tmp;
    static int K, count = 0, result = -1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        
        tmp = new int[N];
        merge_sort(A, 0, N - 1);
        
        System.out.print(result);
    }
    
    static void merge_sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }
    
    static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;
        while (i <= q && j <= r) tmp[t++] = A[ (A[i] <= A[j]) ? i++ : j++ ];
        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];
        
        i = p; t = 0;
        while (i <= r) {
            count++;
            if (count == K) result = tmp[t];
            A[i++] = tmp[t++];
        }
    }
}
