import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //케이스 개수
        String str;
        int cnt;
        int score;

        for (int i = 0; i < num; i++) {
            str = br.readLine();
            cnt = 0;
            score = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    cnt++;
                    score += cnt;
                }
                else if (str.charAt(j) == 'X') {
                    cnt = 0;
                }
            }
            System.out.println(score);
        }

    }
}