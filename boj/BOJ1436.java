import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436 {

    public static boolean has666(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length() - 2; i++) {
            if ((numStr.charAt(i) == '6') && (numStr.charAt(i + 1) == '6') && (numStr.charAt(i + 2) == '6')) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1; //영화제목 번호
        int result;
        for (int i = 666; ; i++) {
            if (has666(i)) {
                if (cnt == N) {
                    result = i;
                    break;
                }
                cnt++;
            }
        }
        System.out.println(result);
    }
}
