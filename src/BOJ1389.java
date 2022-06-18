import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1389 {

    public static boolean[][] path;
    public static boolean[] visited;
    public static int N;

    private static class Info {
        public int index;
        public int dist;

        public Info(int index, int dist) {
            this.index = index;
            this.dist = dist;
        }
    }

    public static int bfs(int start) {
        visited = new boolean[N + 1];
        visited[start] = true;
        Deque<Info> deque = new LinkedList<>();
        deque.add(new Info(start, 0));
        int sum = 0;
        while (!deque.isEmpty()) {
            Info temp = deque.removeFirst();
            int i = temp.index;
            int dist = temp.dist;
            for (int j = 1; j < N + 1; j++) {
                if (path[i][j] && !visited[j]) {
                    visited[j] = true;
                    sum += dist + 1;
                    deque.addLast(new Info(j, dist + 1));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        path = new boolean[N + 1][N + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            path[num1][num2] = true;
            path[num2][num1] = true;
        }

        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 1; i < N + 1; i++) {
            int sum = bfs(i);
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
}
