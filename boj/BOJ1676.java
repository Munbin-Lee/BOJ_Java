import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1676 {

    public static BigInteger factorial(int num) {
        if (num == 0) {
            return BigInteger.valueOf(1);
        }
        return factorial(num - 1).multiply(BigInteger.valueOf(num));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = String.valueOf(factorial(N));
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                result++;
            }
            else {
                break;
            }
        }
        System.out.println(result);
    }
}
