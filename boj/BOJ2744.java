import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a') { //소문자일 경우
                sb.append((char) (str.charAt(i) - ('a' - 'A')));
            }
            else {
                sb.append((char) (str.charAt(i) + ('a' - 'A')));
            }
        }
        System.out.println(sb);
    }
}
