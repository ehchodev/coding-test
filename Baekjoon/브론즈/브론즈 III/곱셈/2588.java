import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine().trim());
        int num2 = Integer.parseInt(br.readLine().trim());
        
        int result = 0;
        for (int i = 0; i < 3; i++) {
            int cal = num1 * (num2 % 10);
            System.out.println(cal);
            
            num2 /= 10;
            result += cal * Math.pow(10, i);
        }
        
        System.out.println(result);
    }
}
