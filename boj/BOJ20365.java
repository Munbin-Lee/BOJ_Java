import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ20365 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        //str -> deque
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.addLast(str.charAt(i));
        }

        int cnt = 0;
        char removeTarget;

        //처음과 끝이 다를 경우
        if (deque.getFirst() != deque.getLast()) {
            cnt++;
            removeTarget = deque.getLast();
            while (deque.getLast() == removeTarget) {
                deque.removeLast();
            }
        }

        while (true) {
            try {
                cnt++;
                removeTarget = deque.getFirst();
                while (deque.getFirst() == removeTarget) {
                    deque.removeFirst();
                }
                while (deque.getLast() == removeTarget) {
                    deque.removeLast();
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
