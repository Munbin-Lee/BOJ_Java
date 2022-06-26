import java.io.*;
import java.util.PriorityQueue;

public class BOJ1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                pq.add(num);
            }
            else {
                if (!pq.isEmpty()) {
                    bw.write(pq.poll() + "\n");
                }
                else {
                    bw.write("0\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
