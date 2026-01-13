import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            arr[i] = s;
            if (s.length() > max) {
                max = s.length();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < max; a++) {
            for (int b = 0; b < 5; b++) {
                if (arr[b].length() > a) {
                    sb.append(arr[b].charAt(a));
                }
            }
        }
        
        System.out.println(sb);
    }
}
