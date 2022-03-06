//WAP제출용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {

    public static void main(String[] args) throws IOException {

        //1000이하의 소수 구하기
        //https://www.tutorialspoint.com/Sieve-of-Eratosthenes-in-java 변형
        int primeMax = 1000;
        boolean[] isPrime = new boolean[primeMax + 1];
        for (int i = 2; i <= primeMax; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; (i * i) <= primeMax; i++) {
            if (isPrime[i]) {
                for (int j = (i * i); j <= primeMax; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //테스트 케이스 개수
        int cnt = 0; //소수 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime[num]) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}