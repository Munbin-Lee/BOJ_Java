import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17614 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j > 0; j /= 10) {
                int tmp = j % 10;
                if (tmp == 3 || tmp == 6 || tmp == 9) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
