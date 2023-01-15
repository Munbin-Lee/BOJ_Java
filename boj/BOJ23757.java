import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ23757 {

    public static int M;
    public static int[] want;
    public static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public static int solve() {
        for (int i = 0; i < M; i++) {
            if (pq.isEmpty()) return 0;
            int cnt = pq.poll() - want[i];
            if (cnt < 0) return 0;
            pq.add(cnt);
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 상자 안의 선물 개수를 우선순위 큐로 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        // 아이들이 각자 원하는 선물 개수
        st = new StringTokenizer(br.readLine(), " ");
        want = new int[M];
        for (int i = 0; i < M; i++) {
            want[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve());
    }
}
