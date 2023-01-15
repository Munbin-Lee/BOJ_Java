import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ15650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 1; i < N - M + 2; i++) {
            deque.add(String.valueOf(i));
        }
        int tempM = M;
        while (--tempM > 0) {
            ArrayDeque<String> tempDeque = new ArrayDeque<>();
            for (String i : deque) {
                int lastNum = i.charAt(i.length() - 1) - '0';
                for (int j = lastNum + 1; j < N - tempM + 2; j++) {
                    tempDeque.add(i + " " + j);
                }
            }
            deque = tempDeque;
        }
        for (String i : deque) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
