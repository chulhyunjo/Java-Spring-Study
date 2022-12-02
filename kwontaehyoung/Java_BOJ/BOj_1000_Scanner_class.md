# BOj_1000_Scanner_class

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
        sc.close();
    }
}
```

```java
// Input
// 3
// 5

// Output
// 8
```

## Scanner 클래스의 특징

- 기본적인 데이터 타입들을 Scanner의 메소드를 사용하여 입력받을 수 있다.  
  
  - 입력 받을 때의 메소드 사용  
    
    - String으로 입력 받기 : next( ) or nextLine( ) 
    
    - int로 입력 받기 : nextInt( )  

- Scanner 을 사용할 시 util 패키지를 경로의 Scanner 클래스를 호출  
  
  - 자바에서 쓰이는 대부분의 클래스는 lang 패키지가 아니라면 import을 통해 호출해주어야 한다.  
  
  - Scanner 의 경우는 java.util 패키지에 있다.  

- 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.  
  
  - Scanner의 입력 메소드들은 대부분 공백과 개행('', '\t', '\r', '\n' 등..)을 기준으로 읽는다.  
  
  - 이 덕분에 사용자의 편의에 따라 쉽게 입력을 받을 수 있다.  

- Scanner 객체 생성  
  
  - Scanner sc = new Scanner(System.in);  
  
  - 주의할 것은 System.in이 들어간다는 점이다.  
  
  - System.in은 사용자로부터 입력을 받기 위한 입력 스트림(데이터 흐름)이다.  

- close() 메소드  
  
  - Scanner를 사용하면 표준입출력 기능이므로 OS 자원을 사용하는데 자원 누수 방지를 위해 이를 돌려주어야 한다.  
  
  - 따라서 close() 메소드를 사용하여 해당 객체를 메모리에서 내려 놓는다. == 객체를 완벽히 소거한다.  
  
  - 변수에 객체를 담아서 생성하면 가비지 컬렉션 대상에서 제외  
  
  - 보통 큰 차이는 없지만 OS 자원을 사용하는 경우 close가 요구된다고 함.
