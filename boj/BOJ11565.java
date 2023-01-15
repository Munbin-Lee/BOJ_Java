import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11565 {

    public static int countOne(String str) {
        int numOfOne = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                numOfOne++;
            }
        }
        return numOfOne;
    }

    public static String getResult(String a, String b) {
        String defeat = "DEFEAT";
        String victory = "VICTORY";
        String c = "";

        int oneCnt = countOne(a);
        for (int i = 0; i < b.length(); i++) {
            if ((b.charAt(i) == '0') && (oneCnt % 2 == 1)) { //0이고 홀수개
                oneCnt--;
            }
            else if ((b.charAt(i) == '1') && (oneCnt % 2 == 0)) { //1이고 짝수개
                oneCnt--;
            }
            if (oneCnt < 0) {
                return defeat;
            }
        }
        return victory;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(getResult(a, b));
    }
}
