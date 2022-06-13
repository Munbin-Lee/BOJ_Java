import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ2812 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        final int K = Integer.parseInt(st.nextToken());
        int _K = K;
        String num = br.readLine();

        //arr에 숫자 각 자리별로 저장
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = num.charAt(i) - '0';
        }

        //deque에 결과 저장
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            while (_K > 0 && !deque.isEmpty()) {
                int temp = deque.getLast();
                if (arr[i] > temp) {
                    deque.removeLast();
                    _K--;
                }
                else {
                    break;
                }
            }
            deque.addLast(arr[i]);
        }

        //출력
        Iterator<Integer> itr = deque.iterator();
        for (int i = 0; i < N - K; i++) {
            bw.write(itr.next() + "");
        }
        bw.flush();
        bw.close();
    }
}
