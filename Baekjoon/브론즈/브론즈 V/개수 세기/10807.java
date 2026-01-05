import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(numbers[i]) == v) cnt++;
        }
        
        System.out.println(cnt);
    }
}
