import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 0;
        int[] arr = new int[N]; //값 저장
        int[] cnt = new int[8001]; //최빈값 카운트용 -4000~4000
        ArrayList<Integer> list = new ArrayList<>(); //최빈값 저장용
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
            cnt[num + 4000]++;
        }
        for (int i = 0; i < 8001; i++) {
            max = Math.max(max, cnt[i]);
        }
        for (int i = 0; i < 8001; i++) {
            if (cnt[i] == max) list.add(i - 4000);
        }
        Arrays.sort(arr);
        System.out.println((int) Math.round((double) sum / N)); //산술평균
        System.out.println(arr[N / 2]); //중앙값
        //최빈값
        if (list.size() == 1) System.out.println(list.get(0));
        else System.out.println(list.get(1));
        System.out.println(arr[N - 1] - arr[0]); //최대-최소

    }
}

