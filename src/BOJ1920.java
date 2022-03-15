import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            int search = Arrays.binarySearch(arr, num);
            int result = (search >= 0) ? 1 : 0;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}