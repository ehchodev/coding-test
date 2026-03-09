import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(factorial(N));
    }
    
    public static long factorial(int num) {
        if (num <= 1) return 1;
        return (long) num * factorial(num - 1);
    }
}
