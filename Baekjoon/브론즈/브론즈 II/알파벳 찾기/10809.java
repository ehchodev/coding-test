import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        String[] alphabets = { "a", "b", "c", "d", "e", "f", "g"
            , "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"
            , "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            sb.append(S.indexOf(alphabets[i])).append(" ");
        }
        
        System.out.println(sb);
    }
}
