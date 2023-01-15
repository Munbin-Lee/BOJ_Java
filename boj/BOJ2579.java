import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfStairs = Integer.parseInt(br.readLine());
        int[] stair = new int[numOfStairs];
        for (int i = 0; i < numOfStairs; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        int[][] dp = new int[numOfStairs][2];
        dp[0][0] = stair[0];
        if (numOfStairs != 1) {
            dp[1][0] = stair[1];
            dp[1][1] = stair[0] + stair[1];
        }
        for (int i = 2; i < numOfStairs; i++) {
            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 2][1]) + stair[i];
            dp[i][1] = dp[i - 1][0] + stair[i];
        }
        System.out.println(Math.max(dp[numOfStairs - 1][0], dp[numOfStairs - 1][1]));
    }
}
