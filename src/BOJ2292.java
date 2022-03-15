import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //http://oeis.org/A077588
        for (int i = 1; ; i++) {
            if (N < 3 * i * i - 3 * i + 2) {
                System.out.println(i);
                break;
            }
        }

    }
}
