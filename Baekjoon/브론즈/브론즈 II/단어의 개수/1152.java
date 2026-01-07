import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        System.out.println(!"".equals(S) ? S.split(" ").length : 0);
    }
}
