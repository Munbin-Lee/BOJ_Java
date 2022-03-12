import java.io.*;

public class BOJ1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean isPalindrome;
        int num;

        while (true) {
            isPalindrome = true;
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray(); //숫자를 배열화, https://stackoverflow.com/questions/8033550/convert-an-integer-to-an-array-of-digits

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    isPalindrome = false;
                    bw.write("no\n");
                    break;
                }
            }
            if (isPalindrome) {
                bw.write("yes\n");
            }
        }
        bw.flush();
        bw.close();
    }
}