import java.io.*;
import java.util.Stack;

public class BOJ4949 {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() - 1; i++) {
            switch (str.charAt(i)) {
                case '(':
                case '[': {
                    stack.push(str.charAt(i));
                    break;
                }
                case ')': {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                }
                case ']': {
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while (!(line = br.readLine()).equals(".")) {
            bw.write(isBalanced(line) ? "yes\n" : "no\n");
        }
        bw.flush();
        bw.close();
    }
}
