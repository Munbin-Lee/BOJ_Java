import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ2061 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[L + 1];
        prime[1] = true;
        for (int i = 2; i < L; i++) {
            if (prime[i]) {
                continue;
            }
            BigInteger divisor = new BigInteger(Integer.toString(i));
            if (K.mod(divisor).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("BAD " + divisor);
                return;
            }
            for (int j = i + i; j <= L; j += i) {
                prime[j] = true;
            }
        }
        System.out.println("GOOD");
    }
}
