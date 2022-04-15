import java.io.*;
import java.util.*;

public class BOJ18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            set.add(num);
        }
        Integer[] setToArr = set.toArray(Integer[]::new);
        for (int i : arr) {
            bw.write(Arrays.binarySearch(setToArr, i) + " ");
        }
        bw.flush();
        bw.close();
    }
}
