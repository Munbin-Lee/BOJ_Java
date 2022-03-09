import java.io.*;
import java.util.Stack;

public class BOJ1874 {

    private static int cnt = 1; //1부터 오름차순 push
    private static final Stack<Integer> stack = new Stack<>();

    public static String writeStack(int num) {
        StringBuilder sb = new StringBuilder();
        while (cnt <= num) {
            stack.push(cnt);
            cnt++;
            sb.append("+\n");
        }
        if (stack.peek() == num) {
            stack.pop();
            sb.append("-\n");
            return sb.toString();
        } else {
            System.out.println("NO");
            System.exit(0);
            return "0"; //의미없음
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine()); //다음 수
            sb.append(writeStack(value));
        }
        System.out.println(sb);
    }

}
