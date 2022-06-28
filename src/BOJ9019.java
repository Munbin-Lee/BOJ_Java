import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ9019 {

    private static class Info {
        public int num;
        public String str;

        public Info(int num, String str) {
            this.num = num;
            this.str = str;
        }
    }

    public static int calc(int num, int i) {
        if (i == 0) {
            return (num * 2) % 10000;
        }
        else if (i == 1) {
            if (num == 0) {
                return 9999;
            }
            return num - 1;
        }
        else if (i == 2) {
            return num % 1000 * 10 + num / 1000;
        }
        else {
            return num / 10 + num % 10 * 1000;
        }
    }

    public static String bfs(int start, int end) {
        String[] s = {"D", "S", "L", "R"};
        boolean[] visited = new boolean[10000];
        visited[start] = true;
        ArrayDeque<Info> deque = new ArrayDeque<>();
        deque.addLast(new Info(start, ""));
        while (!deque.isEmpty()) {
            Info info = deque.removeFirst();
            for (int i = 0; i < 4; i++) {
                int num = calc(info.num, i);
                if (visited[num]) {
                    continue;
                }
                visited[num] = true;
                String str = info.str + s[i];
                if (num == end) {
                    return str;
                }
                deque.addLast(new Info(num, str));
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sb.append(bfs(num1, num2)).append("\n");
        }
        System.out.println(sb);
    }
}
