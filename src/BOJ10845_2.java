//https://worldpeace21.tistory.com/22 변형


import java.io.*;
import java.util.StringTokenizer;

class Queue {
    private final int[] queue;
    private int frontIndex = 0;
    private int backIndex = -1;

    Queue(int number) {
        queue = new int[number];
    }

    public void push(int x) {
        queue[++backIndex] = x;
    }

    public int size() {
        return backIndex - frontIndex + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        else
            return queue[frontIndex++];
    }

    public int front() {
        if (isEmpty())
            return -1;
        else
            return queue[frontIndex];
    }

    public int back() {
        if (isEmpty())
            return -1;
        else
            return queue[backIndex];
    }

}

public class BOJ10845_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue queue = new Queue(N);
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    queue.push(X);
                    break;
                case "pop":
                    bw.write(queue.pop() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    bw.write(queue.front() + "\n");
                    break;
                case "back":
                    bw.write(queue.back() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}