import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ11403 {

    public static int N;
    public static boolean[][] path;

    public static boolean bfs(int start, int end) {
        boolean[] visited = new boolean[N + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        while (!deque.isEmpty()) {
            int i = deque.removeFirst();
            for (int j = 1; j <= N; j++) {
                if (!path[i][j] || visited[j]) {
                    continue;
                }
                if (j == end) {
                    return true;
                }
                visited[j] = true;
                deque.addLast(j);
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        path = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());
                path[i][j] = num == 1;
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (bfs(i, j)) {
                    sb.append("1 ");
                }
                else {
                    sb.append("0 ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
