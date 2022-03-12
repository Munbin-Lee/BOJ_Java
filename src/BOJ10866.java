import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ10866 {

    private static final ArrayDeque<Integer> deque = new ArrayDeque<>();
    private static final StringBuilder sb = new StringBuilder();

    public static void dequeExecute(String[] str) {
        switch (str[0]) {
            case "push_front": {
                deque.addFirst(Integer.parseInt(str[1]));
                break;
            }
            case "push_back": {
                deque.addLast(Integer.parseInt(str[1]));
                break;
            }
            case "pop_front": {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
                break;
            }
            case "pop_back": {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
                break;
            }
            case "size": {
                sb.append(deque.size()).append("\n");
                break;
            }
            case "empty": {
                sb.append(deque.isEmpty() ? 1 : 0);
                sb.append("\n");
                break;
            }
            case "front": {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
                break;
            }
            case "back": {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            dequeExecute(br.readLine().split(" "));
        }
        System.out.println(sb);
    }
}
