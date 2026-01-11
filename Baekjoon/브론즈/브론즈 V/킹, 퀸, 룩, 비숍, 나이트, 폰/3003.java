import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] pieces = br.readLine().split(" ");
        
        int[] numbers = { 1, 1, 2, 2, 2, 8 };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            int pnum = Integer.parseInt(pieces[i]);
            sb.append(numbers[i] - pnum).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
