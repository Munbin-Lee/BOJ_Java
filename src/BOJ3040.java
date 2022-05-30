import java.io.*;

public class BOJ3040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int over = -100;
        for (int i = 0; i < 9; i++) {
            over += arr[i];
        }

        int i;
        int j = 0;

        Loop:
        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 9; j++) {
                if (over == arr[i] + arr[j]) {
                    break Loop;
                }
            }
        }

        for (int k : arr) {
            if (k == arr[i] || k == arr[j]) {
                continue;
            }
            bw.write(k + "\n");
        }
        bw.flush();
        bw.close();
    }
}
