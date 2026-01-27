import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        char[] arr = N.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        System.out.print(sb.reverse().toString());
    }
}
