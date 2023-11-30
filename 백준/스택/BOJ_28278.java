package 스택;

/* https://www.acmicpc.net/problem/28278 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(stack.pop() + "\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size() + "\n");
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "5":
                    if (stack.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(stack.peek() + "\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
