import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10845_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push": {
                    int num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    break;
                }
                case "pop": {
                    int result = deque.isEmpty() ? -1 : deque.removeFirst();
                    bw.write(result + "\n");
                    break;
                }
                case "size": {
                    bw.write(deque.size() + "\n");
                    break;
                }
                case "empty": {
                    int result = deque.isEmpty() ? 1 : 0;
                    bw.write(result + "\n");
                    break;
                }
                case "front": {
                    int result = deque.isEmpty() ? -1 : deque.getFirst();
                    bw.write(result + "\n");
                    break;
                }
                case "back": {
                    int result = deque.isEmpty() ? -1 : deque.getLast();
                    bw.write(result + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
