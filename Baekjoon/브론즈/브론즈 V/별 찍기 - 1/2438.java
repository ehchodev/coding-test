import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String str = "";
        for (int i = 1; i <= N; i++) {
            str += "*";
            System.out.println(str);
        }
    }
}
