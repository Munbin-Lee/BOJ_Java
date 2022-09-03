import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ17413_2 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean tag = false;
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {

            // 태그는 끝날 때까지 그대로 출력
            if (tag) {
                while (str.charAt(i) != '>') {
                    sb.append(str.charAt(i));
                    i++;
                }
                sb.append('>');
                tag = false;
            }

            // 태그 시작
            else if (str.charAt(i) == '<') {

                // 거꾸로 출력
                while (!deque.isEmpty()) {
                    sb.append(deque.removeLast());
                }

                sb.append('<');
                tag = true;
            }
            else if (str.charAt(i) == ' ') {

                // 거꾸로 출력
                while (!deque.isEmpty()) {
                    sb.append(deque.removeLast());
                }

                sb.append(' ');
            }

            // 태그가 아닌 문자는 deque에 저장
            else deque.addLast(str.charAt(i));
        }

        // 거꾸로 출력
        while (!deque.isEmpty()) {
            sb.append(deque.removeLast());
        }

        System.out.println(sb);
    }
}
