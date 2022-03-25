import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int repeat;
        String str;
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            repeat = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
