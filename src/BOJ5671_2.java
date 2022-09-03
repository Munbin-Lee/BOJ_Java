import java.util.HashSet;
import java.util.Scanner;

public class BOJ5671_2 {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { // EOF
            int N = sc.nextInt();
            int M = sc.nextInt(); // N보다 크거나 같고 M보다 작거나 같다.
            // 방 개수
            int sum = 0;
            while (N <= M) { // N이 M보다 작거나 같을 때 까지
                for (int i = N; i > 0; i /= 10) {
                    set.add(i % 10);
                }
                if (Integer.toString(N).length() == set.size()) {
                    sum++;
                }
                set.clear();
                N++;
            }
            System.out.println(sum);

        }
    }
}