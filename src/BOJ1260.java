import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1260 {

    public static BufferedWriter bw;
    public static int N;
    public static boolean[][] path;
    public static boolean[] visited;

    public static void DFS(int i) throws IOException {
        visited[i] = true;
        bw.write(i + " ");
        for (int j = 1; j < N + 1; j++) {
            if (path[i][j] && !visited[j]) {
                DFS(j);
            }
        }
    }

    public static void BFS(int start) throws IOException {
        visited[start] = true;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        bw.write(start + " ");

        while (!deque.isEmpty()) {
            int i = deque.removeFirst();
            for (int j = 1; j < N + 1; j++) {
                if (path[i][j] && !visited[j]) {
                    visited[j] = true;
                    deque.addLast(j);
                    bw.write(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        path = new boolean[N+1][N + 1];
        visited = new boolean[N + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            path[num1][num2] = true;
            path[num2][num1] = true;
        }

        DFS(V);
        bw.write("\n");

        visited = new boolean[N + 1];
        BFS(V);

        bw.flush();
        bw.close();
    }
}
