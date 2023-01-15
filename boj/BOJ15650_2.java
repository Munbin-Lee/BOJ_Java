import java.io.*;
import java.util.StringTokenizer;

public class BOJ15650_2 {

    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    public static int[] arr;
    public static int N;
    public static int M;

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            arr[depth] = i;
            dfs(depth + 1);
            for (int j = i + 1; j <= N; j++) {
                visited[j] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        arr = new int[M];
        dfs(0);
        System.out.println(sb);
    }
}
