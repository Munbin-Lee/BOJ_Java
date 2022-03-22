import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push": {
                    int X = Integer.parseInt(st.nextToken());
                    stack.add(X);
                    break;
                }
                case "pop": {
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                }
                case "size": {
                    bw.write(stack.size() + "\n");
                    break;
                }
                case "empty": {
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;
                }
                case "top": {
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
