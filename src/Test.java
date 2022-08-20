import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static StringBuilder reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            sb.append(new StringBuilder(s).reverse()).append(' ');
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split("(?=<.*>)|>(?=.*)");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
