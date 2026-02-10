import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (".".equals(s)) break;
            
            Stack<Character> stk = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stk.push(c);
                } else if (c == ')' || c == ']') {
                    if (stk.isEmpty() || (c == ')' && stk.peek() != '(') || (c == ']' && stk.peek() != '[')) {
                        stk.push(c);
                        break;
                    }
                    stk.pop();
                }
            }
            
            if (stk.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}
