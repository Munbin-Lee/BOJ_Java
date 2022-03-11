import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger num = new BigInteger(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += num.remainder(BigInteger.valueOf(10)).intValue();
            num = num.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum);
    }
}