import java.io.*;

class Main {
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        while ((str = br.readLine()) != null) {
            sb = new StringBuilder();
            
            int N = Integer.parseInt(str);
            int len = (int) Math.pow(3, N);
            cantorSet(len);
            System.out.println(sb);
        }
    }
    
    static void cantorSet(int len) {
        if (len == 1) {
            sb.append("-");
            return;
        }
        
        len /= 3;
        
        cantorSet(len);
        for (int i = 0; i < len; i++) sb.append(" ");
        cantorSet(len);
    }
}
