import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1~N 덱
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        // N명 제거
        while (N-- > 0) {
            for (int i = 0; i < K - 1; i++) {
                // 맨 앞의 요소를 맨 뒤로
                deque.addLast(deque.removeFirst());
            }
            sb.append(deque.removeFirst()).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append('>');
        System.out.println(sb);
    }
}
