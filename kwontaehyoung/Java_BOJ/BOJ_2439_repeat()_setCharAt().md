# BOJ_2439_repeat()_setCharAt()

```java
import java.io.*;

// 별 찍기2 1번 풀이
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder stars = new StringBuilder();
        for (int i=0; i<n; i++) {
            stars.append(" ".repeat(n - i - 1));
            stars.append("*".repeat(i + 1));
            stars.append("\n");
        }
        System.out.println(stars);
        br.close();
    }
}
```

```java
import java.io.*;

// 별 찍기2 2번 풀이
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder stars = new StringBuilder();
        stars.append(" ".repeat(Math.max(0, n)));
        for (int j=n-1; j>=0; j--) {
            stars.setCharAt(j, '*');
            System.out.println(stars);
        }
        br.close();
    }
}
```

## 1번 풀이와 2번 풀이의 차이점

- 1번 풀이
  
  - stars라는 StringBuilder 객체에 개행문자까지 포함하여 정답으로 출력할 내용을 모두 완성하고 한 번에 출력하였다.

- 2번 풀이
  
  - 1번과 비슷하지만 단 한 줄만을 조작하며 반복회차마다 한 줄씩 출력하였다.
  
  - setCharAt으로 해당 인덱스를 원하는 문자(char)로 대체하였으며, 이때는 작은 따옴표를 사용해야한다.

- 두 풀이의 연산시간은 같았지만 상대적으로 1번 풀이가 메모리를 덜 사용하였다.
