//39591959번 소스 참고

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1037_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        if (T % 2 == 0) {
            System.out.println(arr[0] * arr[T - 1]);
        }
        else {
            System.out.println(arr[T / 2] * arr[T / 2]);
        }
    }
}
