import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1931 {

    private static class Time implements Comparable<Time> {
        public int start;
        public int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        //start 작은 순 -> end 작은 순
        @Override
        public int compareTo(Time time) {
            if (this.start == time.start) {
                return Integer.compare(this.end, time.end);
            }
            return Integer.compare(this.start, time.start);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Time[] times = new Time[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            times[i] = new Time(num1, num2);
        }
        Arrays.sort(times);
        int cnt = 1;
        int select = 0;
        for (int i = 1; i < N; i++) {
            Time t = times[i];
            if (t.start < times[select].end) {
                if (t.end < times[select].end) {
                    select = i;
                }
            }
            else {
                cnt++;
                select = i;
            }
        }
        System.out.println(cnt);
    }
}
