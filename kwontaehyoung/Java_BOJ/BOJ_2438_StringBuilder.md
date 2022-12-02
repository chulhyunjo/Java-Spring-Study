# BOJ_2438_StringBuilder

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 별 찍기 1
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String star = "";
        for (int i=0; i<N; i++) {
            star += '*';
            System.out.println(star);
        }
        br.close();
    }
}
```

- 위 코드는 star를 String으로 지정하여 별을 찍어낸 코드이다.

- 이처럼 문자열을 더하는 경우가 많아지면 아래 코드처럼 StringBuilder( ) 객체를 사용하여 속도를 더 높일 수 있다.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 별 찍기 1
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();
        for (int i=0; i<N; i++) {
            star.append('*');
            System.out.println(star);
        }
        br.close();
    }
}
```

- 두 코드의 연산 속도 차이는 Input값이 커질수록 선명히 나타날 것이다.
