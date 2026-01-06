import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int sum = 0;
        for (String s : str.split("")) {
            sum += Integer.parseInt(s);
        }
        
        System.out.println(sum);
    }
}
