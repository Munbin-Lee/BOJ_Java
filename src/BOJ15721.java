import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int word = Integer.parseInt(br.readLine());

        // 0 = 뻔, 1 = 데기
        int[] start = {0, 1, 0, 1};

        int idx = 0; // 사람 번호
        int round = 1; // 회차
        int fun = 0;
        int degi = 0;
        int cnt = 0; // 한 회차에서의 진행 번호

        while (true) {
            if (cnt < 4) {
                if (start[cnt] == 0) fun++;
                else degi++;
            }
            else {
                if (cnt < round + 5) fun++;
                else degi++;
            }

            // 조건을 만족할 경우 루프 탈출
            if (word == 0 && fun == T) break;
            if (word == 1 && degi == T) break;

            cnt++;
            if (cnt > round * 2 + 5) {
                round++;
                cnt = 0;
            }

            idx++;
            if (idx >= A) idx = 0;
        }

        System.out.println(idx);
    }
}
