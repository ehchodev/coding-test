import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        String a1 = S[0], b1 = S[1];
        
        String a2 = "", b2 = "";
        for (int i = 2; i >= 0; i--) {
            a2 += a1.charAt(i);
            b2 += b1.charAt(i);
        }
        
        int a3 = Integer.parseInt(a2), b3 = Integer.parseInt(b2);
        System.out.println(Math.max(a3, b3));
    }
}
