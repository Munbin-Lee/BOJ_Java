import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (N-- > 0) {
            if (v == Integer.parseInt(st.nextToken())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
