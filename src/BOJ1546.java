import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] score = new int[num];
        double max = 0;
        double total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < num; i++) {
            total += (score[i] / max * 100);
        }
        System.out.println(total / num);
    }
}
