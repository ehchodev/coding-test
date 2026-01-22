import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int a = N / 5;
        int cnt = -1;
        for (int i = a; i >= 0; i--) {
            int value = N - (i * 5);
            if (value % 3 == 0) {
                cnt = i + (value / 3);
                break;
            }
        }
 
        System.out.print(cnt);
    }
}
