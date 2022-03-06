//WAP제출용

import java.io.*;
import java.util.StringTokenizer;

public class BOJ4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num1, num2, num3, max, mid, min;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            num3 = Integer.parseInt(st.nextToken());
            if (num1 == 0) {
                break;
            }
            max = Math.max(num1, Math.max(num2, num3));
            min = Math.min(num1, Math.min(num2, num3));
            mid = num1 + num2 + num3 - max - min;
            if (min * min + mid * mid == max * max) { //피타고라스
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();

    }
}