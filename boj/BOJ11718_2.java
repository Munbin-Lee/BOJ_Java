import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11718_2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            sb.append(line).append('\n');
        }
        System.out.println(sb);
    }
}
