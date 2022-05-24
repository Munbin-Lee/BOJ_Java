import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ17626_2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = (int) (Math.sqrt(n) + 1.5);
        for (int b = 0; b < max; ++b) {
            for (int c = b; c < max; ++c) {
                for (int d = c; d < max; ++d) {
                    if (b * b + c * c + d * d != n) {
                        continue;
                    }
                    if (c == 0) {
                        System.out.println(1);
                        return;
                    }
                    if (b == 0) {
                        System.out.println(2);
                        return;
                    }
                    System.out.println(3);
                    return;
                }
            }
        }
        System.out.println(4);
    }
}
