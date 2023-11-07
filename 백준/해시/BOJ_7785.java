package 해시;

/* https://www.acmicpc.net/problem/7785 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();

            if (hm.containsKey(name)) {
                hm.remove(name);
            } else {
                hm.put(name, 1);
            }
        }

        ArrayList<String> keyList = new ArrayList<>(hm.keySet());

        Collections.sort(keyList, Collections.reverseOrder());

        for (String str : keyList) {
            sb.append(str + "\n");
        }

        System.out.print(sb);
    }
}
