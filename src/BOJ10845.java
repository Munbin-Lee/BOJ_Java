import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push": {
                    int X = Integer.parseInt(st.nextToken());
                    queue.offer(X);
                    break;
                }
                case "pop": {
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.removeFirst() + "\n");
                    }
                    break;
                }
                case "size": {
                    bw.write(queue.size() + "\n");
                    break;
                }
                case "empty": {
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                }
                case "front": {
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.getFirst() + "\n");
                    }
                    break;
                }
                case "back": {
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.getLast() + "\n");
                    }
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}