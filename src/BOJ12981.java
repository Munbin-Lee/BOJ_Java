import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12981 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] rgb = new int[3];
        for (int i = 0; i < 3; i++) {
            rgb[i] = Integer.parseInt(st.nextToken());
        }

        int box = 0;

        // 3개 이상인 색을 포장
        for (int i = 0; i < 3; i++) {
            while (rgb[i] >= 3) {
                rgb[i] -= 3;
                box++;
            }
        }

        // RGB 포장
        while (rgb[0] >= 1 && rgb[1] >= 1 && rgb[2] >= 1) {
            rgb[0]--;
            rgb[1]--;
            rgb[2]--;
            box++;
        }

        // 남은 색 포장
        int left = 0;
        for (int i : rgb) {
            left += i;
        }
        box += (left + 1) / 2;

        System.out.println(box);
    }
}
