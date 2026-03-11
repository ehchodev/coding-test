import java.io.*;

class Main {
    static char[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        arr = new char[N][N];
        
        setStars(0, 0, N, false);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.print(sb);
    }
    
    static void setStars(int a, int b, int len, boolean isBlank) {
        if (isBlank) {
            for (int i = a; i < a + len; i++) {
                for (int j = b; j < b + len; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        
        if (len == 1) {
            arr[a][b] = '*';
            return;
        }
        
        int nextLen = len / 3;
        int cnt = 0;
        for (int i = a; i < a + len; i+= nextLen) {
            for (int j = b; j < b + len; j += nextLen) {
                cnt++;
                setStars(i, j, nextLen, (cnt == 5));
            }
        }
    }
}
