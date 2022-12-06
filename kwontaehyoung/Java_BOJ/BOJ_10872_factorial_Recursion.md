# BOJ_10872_factorial_Recursion

```java
import java.io.*;

// 팩토리얼
public class Main {
    public static int fact(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fact(n));
        br.close();
    }
}
```

- 자바 첫 재귀 풀이 !


