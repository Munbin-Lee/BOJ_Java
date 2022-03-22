import java.io.*;

public class BOJ2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[15][15]; //x층 x호의 거주민 수
        for (int i = 1; i < 15; i++) {
            arr[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                int sum = 0;
                for (int k = 1; k <= j; k++) {
                    sum += arr[i - 1][k];
                }
                arr[i][j] = sum;
            }
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[k][n]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
