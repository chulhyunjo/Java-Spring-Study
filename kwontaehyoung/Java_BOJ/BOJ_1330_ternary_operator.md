# BOJ_1330_ternary_operator

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a >= b ? (a == b ? "==" : ">") : "<");
    }

}
```

```java
// Input
// 3 5

// Output
// <
```



## 삼항 연산자 (ternary operator)

- 조건식 ? 반환값1 : 반환값2  
  
  - 조건식 참 -> 반환값1 리턴  
  
  - 조건식 거짓 -> 반환값2 리턴
