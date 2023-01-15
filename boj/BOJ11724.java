import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ11724 {

    public static int N;
    public static boolean[] visited;
    public static boolean[][] path;

    public static void bfs(int start) {
        visited[start] = true;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        while (!deque.isEmpty()) {
            int i = deque.removeFirst();
            for (int j = 1; j <= N; j++) {
                if (visited[j] || !path[i][j]) {
                    continue;
                }
                visited[j] = true;
                deque.addLast(j);
            }
        }
    }

    public static int solve() {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                bfs(i);
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        path = new boolean[N + 1][N + 1];
        int M = Integer.parseInt(st.nextToken());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            path[num1][num2] = true;
            path[num2][num1] = true;
        }
        System.out.println(solve());
    }
}
