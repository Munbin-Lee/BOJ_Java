import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        int[] arrAscend = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrDescend = {8, 7, 6, 5, 4, 3, 2, 1};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(arr, arrAscend)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, arrDescend)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}