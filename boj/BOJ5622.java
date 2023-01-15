import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'P') { //A~P
                result += (str.charAt(i) - 56) / 3;
            }
            else if (str.charAt(i) == 'Z') {
                result += 10;
            }
            else { //Q~Y
                result += (str.charAt(i) - 57) / 3;
            }
        }
        System.out.println(result);
    }
}
