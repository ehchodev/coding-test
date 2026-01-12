import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cnt = N;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            
            String prev = "" + s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j - 1) != s.charAt(j)) {
                    if (prev.contains("" + s.charAt(j))) {
                        cnt--;
                        break;
                    } else {
                        prev += s.charAt(j);
                    }
                }
            }
        }
        
        System.out.print(cnt);
    }
}
