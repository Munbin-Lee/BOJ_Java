import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(1);
        }
        else if (N == 1) {
            System.out.println(1);
        }
        else if (N == 2) {
            System.out.println(2);
        }
        else if (N == 3) {
            System.out.println(6);
        }
        else if (N == 4) {
            System.out.println(24);
        }
        else if (N == 5) {
            System.out.println(120);
        }
        else if (N == 6) {
            System.out.println(720);
        }
        else if (N == 7) {
            System.out.println(5040);
        }
        else if (N == 8) {
            System.out.println(40320);
        }
        else if (N == 9) {
            System.out.println(362880);
        }
        else if (N == 10) {
            System.out.println(3628800);
        }
        else if (N == 11) {
            System.out.println(39916800);
        }
        else {
            System.out.println(479001600);
        }
    }
}
