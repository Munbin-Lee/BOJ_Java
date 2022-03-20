import java.io.*;
import java.util.StringTokenizer;

public class BOJ4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            if (num1 == 0) {
                break;
            }

            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            int mid = num1 + num2 + num3 - max - min;

            if (min * min + mid * mid == max * max) {
                bw.write("right\n"); //피타고라스
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();
    }
}