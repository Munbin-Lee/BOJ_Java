import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11726 {

    public static int[] dp = new int[100001];

    public static int solve(int num) {
        if (num == 0 || num == 1) {
            dp[num] = 1;
            return dp[num];
        }
        if (dp[num - 1] == 0) {
            dp[num - 1] = solve(num - 1);
        }
        if (dp[num - 2] == 0) {
            dp[num - 2] = solve(num - 2);
        }
        return (dp[num - 1] + dp[num - 2]) % 10007;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solve(N));
    }
}
