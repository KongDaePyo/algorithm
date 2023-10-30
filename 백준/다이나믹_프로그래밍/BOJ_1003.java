package 다이나믹_프로그래밍;

/* https://www.acmicpc.net/problem/1003 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003 {

    static Integer[][] arr = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr[0] = new Integer[]{1, 0};
        arr[1] = new Integer[]{0, 1};

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            solution(n);

            System.out.println(arr[n][0] + " " + arr[n][1]);
        }
    }

    static Integer[] solution(int n) {

        if(arr[n][0] == null || arr[n][1] == null) {
            arr[n][0] = solution(n - 1)[0] + solution(n - 2)[0];
            arr[n][1] = solution(n - 1)[1] + solution(n - 2)[1];
        }

        return arr[n];

    }
}
