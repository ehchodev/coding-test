import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for (String s : a.split("")) {
            if (s.equals(s.toUpperCase())) {
                answer += s.toLowerCase();
            } else {
                answer += s.toUpperCase();
            }
        }
        
        System.out.println(answer);
    }
}
