import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int a1 = Math.abs(o1);
            int a2 = Math.abs(o2);
            if (a1 == a2) {
                return o1 - o2;
            }
            return a1 - a2;
        });
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                }
                else {
                    sb.append(pq.poll()).append("\n");
                }
            }
            else {
                pq.add(num);
            }
        }
        System.out.println(sb);
    }
}
