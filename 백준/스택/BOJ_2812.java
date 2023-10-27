package 스택;

/* https://www.acmicpc.net/problem/2812 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int len = n - k;

        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        for(int i = 0; i < str.length() ; i++){
            if(!stack.empty()){
                while(!stack.empty() && k > 0 && stack.peek() < str.charAt(i)){
                    stack.pop();
                    k--;
                }
            }

            stack.push(str.charAt(i));
        }

        while(true){
            if(stack.size() == len)
                break;

            stack.pop();
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.print(sb.reverse().toString());
    }
}
