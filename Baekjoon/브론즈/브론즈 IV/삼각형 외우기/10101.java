import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        String s = "";
        if (a == 60 && b == 60 && c == 60) {
            s = "Equilateral";
        } else if (a + b + c == 180) {
            if (a == b || b == c || c == a) {
                s = "Isosceles";
            } else {
                s = "Scalene";
            }
        } else {
            s = "Error";
        }
        
        System.out.print(s);
    }
}
