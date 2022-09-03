import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ2503 {

    public static boolean[] cannot = new boolean[988];


    public static void solve(int num, int strike, int ball) {
        for (int i = 123; i <= 987; i++) {
            if (cannot[i]) continue;

            // 백의 자리, 십의 자리, 일의 자리
            int ia = i / 100;
            int ib = (i % 100) / 10;
            int ic = i % 10;

            // 불가능한 조합은 처리에서 제외
            if (ib == 0 || ic == 0 || ia == ib || ib == ic || ic == ia) {
                cannot[i] = true;
                continue;
            }

            int iStrike = 0; // i가 정답이라 가정했을 때의 스트라이크
            int iBall = 0;   // i가 정답이라 가정했을 때의 볼
            int a = num / 100;
            int b = (num % 100) / 10;
            int c = num % 10;

            if (ia == a) iStrike++;
            if (ib == b) iStrike++;
            if (ic == c) iStrike++;
            if (ia == b || ia == c) iBall++;
            if (ib == c || ib == a) iBall++;
            if (ic == a || ic == b) iBall++;

            // 불가능한 경우 cannot 배열에 true 저장
            if (iStrike != strike || iBall != ball) cannot[i] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            solve(num, strike, ball);
        }

        int cnt = 0;
        for (int i = 123; i <= 987; i++) {
            if (!cannot[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
