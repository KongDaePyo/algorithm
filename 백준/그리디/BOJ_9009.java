package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_9009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0);
            arr.add(1);

            int j = 1;
            while (j <= n) {
                arr.add(j);

                j = arr.get(arr.size() - 2) + arr.get(arr.size() - 1); // 2index == 1, 3 index == 2, 4 index == 3
            }

            int sum = 0, index = 1;
            ArrayList<Integer> temp = new ArrayList<>();
            while (sum != n) {
                int num = arr.get(arr.size() - index); // 89

                if (sum + num > n) {
                    index++;
                } else {
                    sum += num;
                    temp.add(num);
                }
            }

            Collections.sort(temp);
            for (Integer tmp : temp) {
                sb.append(tmp + " ");
            }
            sb.append("\n");

            arr.clear();
            temp.clear();
        }

        System.out.print(sb);
    }
}
