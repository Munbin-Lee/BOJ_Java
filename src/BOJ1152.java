import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 1;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        if (str.equals(" ")) {
            count = 0;
        }

        System.out.println(count);

    }
}