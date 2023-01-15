import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2754 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();
        double score;
        if (grade.charAt(0) == 'F') {
            score = 0;
        }
        else {
            score = 'E' - grade.charAt(0); //A=4, B=3...
            if (grade.charAt(1) == '+') {
                score += 0.3;
            }
            else if (grade.charAt(1) == '-') {
                score -= 0.3;
            }
        }
        System.out.println(score);
    }
}
