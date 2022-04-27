//다시풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1107 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] isBroken = new boolean[10];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            isBroken[Integer.parseInt(st.nextToken())] = true;
        }
        int min = Math.abs(N - 100); //+,-만 사용

        loop:
        for (int i = 0; i <= 999999; i++) {
            String[] arr = String.valueOf(i).split("");
            for (String j : arr) {
                if (isBroken[Integer.parseInt(j)]) {
                    continue loop;
                }
            }
            min = Math.min(min, Math.abs(N - i) + arr.length);
        }
        System.out.println(min);
    }
}
