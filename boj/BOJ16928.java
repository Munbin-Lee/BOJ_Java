import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ16928 {

    public static int[] move;

    private static class Info {
        public int index;
        public int cnt;

        public Info(int index, int cnt) {
            this.index = index;
            this.cnt = cnt;
        }
    }

    public static int bfs() {
        boolean[] visited = new boolean[101];
        ArrayDeque<Info> deque = new ArrayDeque<>();
        deque.addLast(new Info(1, 0));
        visited[1] = true;
        while (!deque.isEmpty()) {
            Info info = deque.removeFirst();
            int index = info.index;
            int cnt = info.cnt + 1;
            for (int i = 1; i <= 6; i++) {
                int next = index + i;
                if (move[next] != 0) {
                    next = move[next];
                }
                if (next > 100 || visited[next]) {
                    continue;
                }
                if (next == 100) {
                    return cnt;
                }
                visited[next] = true;
                deque.addLast(new Info(next, cnt));
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        move = new int[101];
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            move[num1] = num2;
        }
        System.out.println(bfs());
    }
}
