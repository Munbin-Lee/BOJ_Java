import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {

    public static int findMin(int num) {
        for (int i = num / 5; i >= 0; i--) {
            int cnt = i;
            int tmp = num - i * 5; //아직 필요한 설탕의 양
            if (tmp % 3 == 0) {
                cnt += tmp / 3;
                return cnt;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(findMin(N));
    }
}
