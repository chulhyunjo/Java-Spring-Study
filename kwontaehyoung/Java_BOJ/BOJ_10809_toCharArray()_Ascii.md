# BOJ_10809_toCharArray()_Ascii

```java
import java.io.*;

// 알파벳 찾기
public class Main {

    // 26개의 integer를 받을 정적 배열 선언
    static int[] cIdx = new int[26];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 문자열을 각각의 문자를 원소로 받는 배열화
        char[] cArr = br.readLine().toCharArray(); // [1]

        // cIdx 배열의 모든 원소를 -1로 초기화
        for (int i=0; i<26; i++) {
            cIdx[i] = -1;
        }

        // 매 반복마다 char 타입의 c변수에 입력받은 문자열의 문자 하나씩 할당
        for (int i=0; i<cArr.length; i++) {
            char c = cArr[i];
            // 문자(Char타입) 끼리의 사칙연산은 암시적 형변환에 의해 아스키 코드값으로 계산됨
            if (cIdx[c-'a'] == -1) {  // [2]
                cIdx[c-'a'] = i;
            }
        }

        // 출력을 위한 sb 변수에 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<26; i++) {
            // sb에 결과값 하나와 공백 하나를 append
            if (i < 25) {
                sb.append(cIdx[i]).append(" "); // [3]
            // 마지막에는 공백 없이 결과값 하나 append
            }else{
                sb.append(cIdx[i]);
            }
        }
        // 출력
        System.out.println(sb);
        br.close();
    }
}


```

- [1] toCharArray( ) 메소드를 사용하여 입력받은 하나의 Line을 문자(Char)를 원소로 하는 배열로 형변환 하였음

- [2] Char 타입끼리의 사칙연산은 암시적 형변환에 의해 아스키 코드값으로 계산되어 Integer값으로 리턴된다.

- [3] StringBuilder에 append를 하여 문자열을 늘릴 때 연속적인 append 사용이 가능하다.
  
  - sb.append(cIdx[i] + " "); 도 같은 결과를 도출하지만 지양해야한다.


