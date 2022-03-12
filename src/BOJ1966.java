//온몸비틀기대환장스파게티코드파티
//큐 배우고 난 다음 다시풀기

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1966 {

    public static ArrayList<Integer> list;

    public static boolean DoesGreaterOneExist(int num) {
        for (int i = 1; i < list.size(); i++) {
            if (Math.abs(list.get(i)) > num) return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            list = new ArrayList<>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            list.set(M, -list.get(M)); //구분을 위해 음수처리
            int cnt = 1; //출력횟수
            while (true) {
                if (DoesGreaterOneExist(Math.abs(list.get(0)))) {
                    list.add(list.get(0));
                    list.remove(0);
                } else if (list.get(0) < 0) { //특정 문서 출력
                    break;
                } else { //가장 큰 경우
                    list.remove(0);
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();

    }
}
