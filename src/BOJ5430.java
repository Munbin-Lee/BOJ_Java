import java.io.*;
import java.util.*;

public class BOJ5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            while (n-- > 0) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }

            boolean error = false;
            boolean reverse = false;
            for (char i : p) {
                if (i == 'D') {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    else {
                        if (reverse) {
                            deque.removeLast();
                        }
                        else {
                            deque.removeFirst();
                        }
                    }
                }
                else { //i=='R'
                    reverse = !reverse;
                }
            }

            if (!error) {
                sb.append("[");
                Iterator<Integer> iterator;
                if (!reverse) {
                    iterator = deque.iterator();
                }
                else {
                    iterator = deque.descendingIterator();
                }
                while (iterator.hasNext()) {
                    sb.append(iterator.next()).append(",");
                }
                if (!deque.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("]\n");
            }
            else {
                sb.append("error\n");
            }
        }
        System.out.println(sb);
    }
}
