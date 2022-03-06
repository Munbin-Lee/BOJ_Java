//WAP제출용
import java.io.*;

public class BOJ9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); //테스트 수

        while (T-- > 0) {
            int cnt = 0; //여는 괄호-닫는 괄호
            boolean VPS = true;
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    cnt++;
                } else {
                    cnt--;
                }
                if (cnt < 0) {
                    VPS = false;
                    break;
                }
            }
            if (VPS && (cnt == 0)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();

    }
}