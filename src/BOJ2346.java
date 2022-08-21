import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ2346 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1~N 덱
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        // 풍선 안의 숫자
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // N명 제거
        int cnt = 1;
        while (N-- > 0) {
            if (cnt > 0) for (int i = 0; i < cnt - 1; i++) {
                // 맨 앞의 요소를 맨 뒤로
                deque.addLast(deque.removeFirst());
            }
            else for (int i = 0; i < -cnt; i++) {
                // 맨 뒤의 요소를 맨 앞으로
                deque.addFirst(deque.removeLast());
            }
            int target = deque.removeFirst();
            sb.append(target).append(' ');
            cnt = arr[target];
        }

        System.out.println(sb);
    }
}
