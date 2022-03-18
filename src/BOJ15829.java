import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        String str = br.readLine();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < N; i++) {
            BigInteger a = BigInteger.valueOf(str.charAt(i) - 'a' + 1);
            BigInteger r = BigInteger.valueOf(31).pow(i);
            sum = sum.add(a.multiply(r));
        }
        int result = sum.mod(BigInteger.valueOf(1234567891)).intValue();
        System.out.println(result);
    }
}