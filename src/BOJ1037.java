import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            for (int j = 2; j <= i; j++) {
                int temp = 0;
                while (i % j == 0) {
                    i /= j;
                    temp++;
                }
                int cnt = map.getOrDefault(j, 0);
                if (temp > cnt) {
                    map.put(j, temp);
                }
            }
        }

        int result = 1;
        int only = (map.size() == 1) ? 1 : 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            result *= Math.pow(i.getKey(), i.getValue() + only);
        }
        System.out.println(result);
    }
}
