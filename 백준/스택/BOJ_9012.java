package 스택;

/* https://www.acmicpc.net/problem/9012 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean checkVPS = true;

        for (int i = 0; i < T; i++) {
            String ps = br.readLine();

            for (int j = 0; j < ps.length(); j++) {
                char c = ps.charAt(j);

                if (c == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        checkVPS = false;
                        break;
                    }
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty() && checkVPS) {
                sb.append("YES" + "\n");
            } else {
                sb.append("NO" + "\n");
            }

            stack.clear();
            checkVPS = true;
        }

        System.out.print(sb);
    }
}
