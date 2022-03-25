import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        char grade;

        switch (score / 10) {
            case 6:
                grade = 'D';
                break;
            case 7:
                grade = 'C';
                break;
            case 8:
                grade = 'B';
                break;
            case 9:
            case 10:
                grade = 'A';
                break;
            default:
                grade = 'F';
        }
        System.out.println(grade);
    }
}
