import java.io.*;

public class BOJ9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for (int i = 4; i < 101; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            bw.write(arr[num] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
