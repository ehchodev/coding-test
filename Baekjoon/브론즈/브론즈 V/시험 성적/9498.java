import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        
        String rank = "";
        if (score >= 90) {
            rank = "A";
        } else if (score >= 80) {
            rank = "B";
        } else if (score >= 70) {
            rank = "C";
        } else if (score >= 60) {
            rank = "D";
        } else {
            rank = "F";
        }
        
        System.out.println(rank);
    }
}
