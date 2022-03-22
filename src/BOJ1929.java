import java.io.*;
import java.util.StringTokenizer;

public class BOJ1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int oddMoreThanM = (M % 2 == 0) ? M + 1 : M;

        //N 이하의 소수 구하기
        //https://www.tutorialspoint.com/Sieve-of-Eratosthenes-in-java 변형
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; (i * i) <= N; i++) {
            if (isPrime[i]) {
                for (int j = (i * i); j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //2는 수동으로 체크
        if (M < 3) bw.write(2 + "\n");

        //M이상 N이하 홀수 중 소수 체크
        for (int i = oddMoreThanM; i <= N; i += 2) {
            if (isPrime[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}