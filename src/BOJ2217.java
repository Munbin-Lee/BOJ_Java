import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2217 {

    public static void main(String[] args) throws IOException {

        int maxWeight = 0; //최대 중량
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        //1등*1, 2등*2, 3등*3...
        for (int i = 0; i < N; i++) {
            maxWeight = Math.max(maxWeight, arr[N - 1 - i] * (i + 1));
        }
        System.out.println(maxWeight);
    }
}
