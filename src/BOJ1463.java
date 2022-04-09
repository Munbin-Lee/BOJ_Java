//틀림, 다시풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N != 1) {
            while (N % 4 == 0) {
                N /= 4;
                cnt += 2;
            }
            if (N % 3 == 1) {
                N--;
                cnt++;
            }
            else if (N % 3 == 2 && N % 2 == 1) {
                N -= 2;
                cnt += 2;
            }
            while (N % 3 == 0) {
                N /= 3;
                cnt++;
            }
            if (N % 3 == 1) {
                continue;
            }
            while (N % 2 == 0) {
                N /= 2;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
