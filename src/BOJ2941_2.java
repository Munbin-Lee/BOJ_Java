//https://www.acmicpc.net/source/41544281 참고

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String s : arr) {
            str = str.replaceAll(s, "0");
        }
        System.out.println(str.length());
    }
}
