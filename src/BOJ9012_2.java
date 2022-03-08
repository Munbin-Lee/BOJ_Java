//https://www.acmicpc.net/source/18923175 참고

import java.io.*;
import java.util.Stack;

public class BOJ9012_2 {

    public static boolean isVPS(String str) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.empty() && str.charAt(i) == ')') return false;
            else if (str.charAt(i) == '(') stack.push(0);
            else stack.pop();
        }
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            bw.write(isVPS(str) ? "YES\n" : "NO\n");
        }
        bw.flush();
        bw.close();
    }
}