import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String a : alphabets) {
            word = word.replaceAll(a, "a");
        }
        
        System.out.println(word.length());
    }
}
