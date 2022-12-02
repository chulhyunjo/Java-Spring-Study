# BOJ_1271_BufferedReader

```java
import java.io.BufferedReader;     // [1]
import java.io.InputStreamReader;  //
import java.util.StringTokenizer;  // [2]
import java.math.BigInteger; // [3]

// 엄청난 부자 2
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger M = new BigInteger(st.nextToken());
        BigInteger N = new BigInteger(st.nextToken());
        System.out.println(M.divide(N) + "\n" + M.remainder(N));
        br.close();
    }
}
```

- [1] 이번 문제에서는 BufferedReader를 사용하여 입출력을 기능하였다.
  
  - 자세한 내용은 하단에서 다룸
  - InputStreamReader는 BufferedReader의 자식 객체라고만 알고 있자.



- [2] StringTokenizer 객체는 default로 띄어쓰기 기준 문자열을 분리하여 저장한다.
  - nextToken( ) 내장 메소드를 사용하여 변수 st에 저장된 (StringTokenizer로 분리된) 문자열을 맨 앞부터 하나씩 불러온다.



- [3] 위 문제는 간단해보이지만 정수형 입력값의 크기가 10의 1000제곱이기 때문에 Int형으로는 해결되지 않는다.
  
  - 따라서, BigInteger 객체를 사용해야하며, 해당 객체는 divide( )와 remainder( ) 내장 메소드를 사용하여 몫과 나머지를 구할 수 있다.



### BufferedReader

- 택배를 5개 옮겨야한다. 1개씩 직접 옮기는 것 보다 내가 가진 짐 수레에 5개를 모두 쌓아 한 번에 옮기는 것이 효율적이다.  
- 이 때, 짐 수레에 해당하는 기능이 바로 BufferedReader이다. 이와 다르게 Scanner의 경우, 하나씩 옮기기 때문에 30퍼센트 정도 느리다는 이야기가 있다.



### main 함수에 throws Exception을 사용하는 이유

- BufferedReader의 readline() 메소드는 기본적으로 IOE 에러를 처리하지 않고, 자신을 호출한 클래스에게 에러를 던진다.  
- 따라서, 해당 에러를 처리하기 위한 추가 구문이 필요한데 try, catch로 직접 처리하거나, throws 구문을 사용하여 자신을 호출한 객체로 에러를 보낼 수 있다.  
- main 메소드에 던져진 에러는 throws을 사용할 경우, JVM으로 에러를 던져 그 쪽에서 처리한다.
