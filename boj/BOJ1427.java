import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = N % 10;
            N /= 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            bw.write(i + "");
        }
        bw.flush();
        bw.close();
    }
}