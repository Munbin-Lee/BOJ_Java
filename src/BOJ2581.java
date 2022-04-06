import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int primeMax = N + 1;
        boolean[] primeArr = new boolean[primeMax + 1];
        for (int i = 2; i <= primeMax; i++) {
            primeArr[i] = true;
        }
        for (int i = 2; (i * i) <= primeMax; i++) {
            if (primeArr[i]) {
                for (int j = (i * i); j <= primeMax; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            if (primeArr[i]) {
                min = Math.min(min, i);
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
