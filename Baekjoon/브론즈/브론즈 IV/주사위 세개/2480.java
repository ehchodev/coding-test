import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        
        int score = 0;
        if (num1 == num2 && num2 == num3) { // 같은 눈이 3개
            score = 10000 + (num1 * 1000);
        } else if (num1 != num2 && num2 != num3 && num3 != num1) { // 모두 다른 눈
            score = Math.max(num1, Math.max(num2, num3)) * 100;
        } else { // 같은 눈이 2개
            score = 1000 + ((num1 == num2 ? num1 : (num2 == num3) ? num2 : num3) * 100);
        }
        
        System.out.println(score);
    }
}
