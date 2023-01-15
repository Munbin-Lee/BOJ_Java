import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1260 {

    public static StringBuilder sb = new StringBuilder();
    public static boolean[][] path;
    public static boolean[] visited;
    public static int N;

    public static void dfs(int i) {
        visited[i] = true;
        sb.append(i).append(" ");
        for (int j = 1; j < N + 1; j++) {
            if (path[i][j] && !visited[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs(int start) {
        visited[start] = true;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        sb.append(start).append(" ");

        while (!deque.isEmpty()) {
            int i = deque.removeFirst();
            for (int j = 1; j < N + 1; j++) {
                if (path[i][j] && !visited[j]) {
                    visited[j] = true;
                    deque.addLast(j);
                    sb.append(j).append(" ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        path = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            path[num1][num2] = true;
            path[num2][num1] = true;
        }

        dfs(V);
        sb.append("\n");

        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);
    }
}
