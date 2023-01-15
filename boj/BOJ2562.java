import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = -1;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
