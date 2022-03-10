//WAP 제출용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 {

    public static void main(String[] args) throws IOException {

        //1000이하의 한수 구하기
        int maxHansoo = 1000;
        boolean[] hansooArr = new boolean[maxHansoo + 1];
        for (int i = 1; i <= 99; i++) hansooArr[i] = true; //1~99는 한수
        for (int i = 100; i <= maxHansoo; i++) {
            boolean isHansoo = true;
            String iStr = Integer.toString(i);
            int differ = iStr.charAt(1) - iStr.charAt(0); //공차
            for (int j = 1; j + 1 < iStr.length(); j++) {
                if (differ != iStr.charAt(j + 1) - iStr.charAt(j)) {
                    isHansoo = false;
                    break;
                }
            }
            if (isHansoo) hansooArr[i] = true;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0; //한수 개수
        for (int i = 1; i <= N; i++) {
            if (hansooArr[i]) cnt++;
        }
        System.out.println(cnt);
    }
}