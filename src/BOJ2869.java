//WAP제출용

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double V = Integer.parseInt(st.nextToken());
        System.out.println((int)Math.ceil((V - A) / (A - B)) + 1);

    }
}