import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int max = 0;
        int cnt = 0;
        char c = ' ';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                c = key;
                cnt = 1;
            } else if (value == max) {
                cnt++;
            }
        }
        
        System.out.println(cnt > 1 ? "?" : c);
    }
}
