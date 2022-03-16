import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder("<");

        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int cnt = K - 1;
        sb.append(list.remove(cnt));
        for (int i = 0; i < N - 1; i++) {
            cnt += K - 1;
            while (cnt >= list.size()) {
                cnt -= list.size();
            }
            sb.append(", ").append(list.remove(cnt));
        }
        sb.append(">");
        System.out.println(sb);
    }
}