import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int cnt = num / 4;
        System.out.println("long ".repeat(cnt) + "int");
    }
}
