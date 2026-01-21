import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        
        int res = 0;
        for (int i = N - (str.length() * 9); i < N; i++) {
            int sum = i;
            for (char c : String.valueOf(i).toCharArray()) {
                sum += (c - '0');
            }
            
            if (sum == N) {
                res = i;
                break;
            }
        }
        
        System.out.print(res);
    }
}
