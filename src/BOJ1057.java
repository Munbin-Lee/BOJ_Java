import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //noinspection ResultOfMethodCallIgnored
        Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int A = Math.min(num1, num2);
        int B = Math.max(num1, num2);

        int cnt = 0;
        // A = 홀수, B = A+1 이면 반복문 탈출
        while (A != B) {
            A = (A + 1) / 2;
            B = (B + 1) / 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
