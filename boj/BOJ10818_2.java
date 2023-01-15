import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min + " " + max);
    }
}