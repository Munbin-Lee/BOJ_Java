import java.io.*;

public class BOJ9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            for (int i = 4; i <= num; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            bw.write(arr[num] + "\n");
        }
        bw.flush();
        bw.close();
    }
}