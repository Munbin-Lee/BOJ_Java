//다시풀기 (미완성)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int numOfTruth = Integer.parseInt(st.nextToken());
        @SuppressWarnings("MismatchedReadAndWriteOfArray") boolean[] truth = new boolean[N+1];
        while(numOfTruth-->0) {
            int num = Integer.parseInt(st.nextToken());
            truth[num]=true;
        }
        Deque<Deque<Integer>> partyDeque = new ArrayDeque<>();
        while(M-->0) {
            st = new StringTokenizer(br.readLine()," ");
            int numOfPeople = Integer.parseInt(st.nextToken());
            @SuppressWarnings("MismatchedReadAndWriteOfArray") int[] party = new int[numOfPeople];
            for(int i=0; i<numOfPeople; i++) {
                party[i]=Integer.parseInt(st.nextToken());
            }
        }
    }
}
