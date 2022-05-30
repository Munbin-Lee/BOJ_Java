import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10162_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int cnt300 = 0;
        int cnt60 = 0;
        int cnt10 = 0;

        int tmp = T/300;
        T-=tmp*300;
        cnt300+=tmp;

        tmp = T/60;
        T-=tmp*60;
        cnt60+=tmp;

        tmp = T/10;
        cnt10+=tmp;

        System.out.printf("%d %d %d\n", cnt300, cnt60, cnt10);
    }
}
