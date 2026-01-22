import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        int num = 666;
        while (cnt != N) {
            num++;
            String s = String.valueOf(num);
            if (s.contains("666")) cnt++;
        }
        
        System.out.print(num);
    }
}
