# BOJ_1181_단어 정렬_Comparator_

```java
import java.io.*;
import java.util.*;

// 단어 정렬
public class Main {
    // 문자열을 원소로 받는 정적 배열 선언
    static String[] words;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 문자열 갯수 입력
        int N = Integer.parseInt(st.nextToken());
        // 문자열 갯수만큼 배열 크기 할당
        words = new String[N];
        // 문자열을 배열의 원소로 할당
        for (int i=0; i<N; i++) {
            words[i] = br.readLine();
        }
        // words 배열 정렬
        // Comparator를 이용하여 정렬 기준을 원하는대로 변경
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        // 입출력을 위한 sb 객체 선언 및 할당
        StringBuilder sb = new StringBuilder();
        String prev = null;
        for (int i=0; i<N; i++) {
            // 사전순이므로 같은 단어가 연속적으로 들어올 가능성을 배제
            if (prev != null && words[i].equals(prev)) continue;
            sb.append(words[i]).append("\n");
            prev = words[i];
        }
        System.out.println(sb);
        br.close();
    }
}
```


