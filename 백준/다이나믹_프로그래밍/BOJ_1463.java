package 다이나믹_프로그래밍;

/* https://www.acmicpc.net/problem/1463 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.print(solution(n));
    }

    public static Integer solution(Integer n) {

        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(solution(n - 1), Math.min(solution(n / 3), solution(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(solution(n / 3), solution(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(solution(n / 2), solution(n - 1)) + 1;
            } else {
                dp[n] = solution(n - 1) + 1;
            }
        }

        return dp[n];
    }
}
