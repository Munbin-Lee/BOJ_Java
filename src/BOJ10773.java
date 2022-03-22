import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        while (K-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            }
            else {
                stack.add(num);
            }
        }
        while (!stack.isEmpty()) sum += stack.pop();
        System.out.println(sum);
    }

}
