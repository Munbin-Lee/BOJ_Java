import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] hasSubmitted = new boolean[30]; //0~29

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine()) - 1;
            hasSubmitted[num] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!hasSubmitted[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
