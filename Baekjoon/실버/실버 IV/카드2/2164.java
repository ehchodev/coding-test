import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N * 2];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        int front = 0, back = N - 1;
        while (front < back) {
            front++;
            
            if (front == back) break;
            
            arr[++back] = arr[front++];
        }
        
        System.out.print(arr[front]);
    }
}
