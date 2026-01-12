import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double scoreSum = 0, gradeSum = 0;
        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            if ("P".equals(s[2])) continue;
            
            double score = Double.parseDouble(s[1]);
            
            scoreSum += score;
            
            if ("A+".equals(s[2])) {
                gradeSum += score * 4.5;
            } else if ("A0".equals(s[2])) {
                gradeSum += score * 4;
            } else if ("B+".equals(s[2])) {
                gradeSum += score * 3.5;
            } else if ("B0".equals(s[2])) {
                gradeSum += score * 3;
            } else if ("C+".equals(s[2])) {
                gradeSum += score * 2.5;
            } else if ("C0".equals(s[2])) {
                gradeSum += score * 2;
            } else if ("D+".equals(s[2])) {
                gradeSum += score * 1.5;
            } else if ("D0".equals(s[2])) {
                gradeSum += score;
            }
        }
        
        System.out.print(gradeSum / scoreSum);
    }
}
