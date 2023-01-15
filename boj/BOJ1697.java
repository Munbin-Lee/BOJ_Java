import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1697 {

    public static boolean[] visited;

    private static class Info {
        public int index;
        public int cnt;

        public Info(int index, int cnt) {
            this.index = index;
            this.cnt = cnt;
        }
    }

    public static int bfs(int start, int destination) {
        visited[start] = true;
        Deque<Info> deque = new ArrayDeque<>();
        deque.addLast(new Info(start, 0));

        while (!deque.isEmpty()) {
            Info i = deque.removeFirst();
            if (i.index == destination) {
                return i.cnt;
            }
            int[] ni = {i.index - 1, i.index + 1, i.index * 2};
            for (int j : ni) {
                if (j == -1 || j > 100000 || visited[j]) {
                    continue;
                }
                visited[j] = true;
                deque.addLast(new Info(j, i.cnt + 1));
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        System.out.println(bfs(N, K));
    }
}