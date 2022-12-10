# ArrayList

- 리스트와 배열의 차이 
  
  - 리스트 : 크기가 정해져 있지 않음, 동적으로 변함
  
  - 배열 : 크기가 정해져 있음



1. add
   
   ```java
   import java.util.ArrayList;
   
   public class Sample {
       public static void main(String[] args) {
           ArrayList pitches = new ArrayList();
           pitches.add("138");
           pitches.add("129");
           pitches.add("142");
       }
   }
   ```
- ArrayList 를 사용하기 위해서는 import java.util.ArrayList와 같이 먼저 import 필요.

- 특정 위치에 add
  
  ```java
  pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
  ```

- 제네릭스 
  
  ```java
  ArrayList<String> pitches = new ArrayList<>();
  ```

       객체를 포함하는 자료형도 어떤 객체를 포함하는 지 명확하게 표현할 것

        => 명확한 타입 체크가 가능/ 자료형에 대한 형변환 과정이 필요없음

        위 코드의 경우 ArrayList안에 담을 수 있는 자료형은 String 타입뿐임을 의미



2. get
   
   특정 인덱스 요소 출력
   
   ```java
   System.out.println(pitches.get(1));
   ```



3. size(length와 비슷)
   
   개수를 리턴
   
   ```java
   System.out.println(pitches.size());
   ```



4. remove
   
   - remove(객체) - 리스트에서 객체에 해당되는 항목을 삭제하고 부울형 값을 리턴
     
     ```java
     System.out.println(pitches.remove("129"));//true
     ```
   
   - remove(인덱스) - 해당 인덱스 항목을 삭제하고 삭제된 항목을 리턴
     
     ```java
     System.out.println(pitches.remove(0));//138
     ```

# 다양한 방법으로 ArrayList 만들기

1.  add 메소드 사용
   
   ```java
   import java.util.ArrayList;
   
   public class Sample {
       public static void main(String[] args) {
           ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
           pitches.add("138");
           pitches.add("129");
           pitches.add("142");
           System.out.println(pitches);  // [138, 129, 142] 출력
       }
   }
   ```

2. 이미 데이터가 존재하는 경우
   
   ```java
   import java.util.ArrayList;
   import java.util.Arrays;
   
   public class Sample {
       public static void main(String[] args) {
           String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
           ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
            //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
           System.out.println(pitches);  // [138, 129, 142] 출력
       }
   }
   ```

        java.util.Arrays 클래스의 asList메소드를 활용

        asList 메소드는 String 배열이 아닌 String 자료 여러개로도 생성가능 (주석부분)



# String.join

파이썬의 join처럼 ArrayList의 각 요소를 문자열로 join 시켜보자

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
```

String.join("구분자",리스트객체)

또한 문자열 배열(Array)에도 사용 가능하다. 

```java
public class Sample {
    public static void main(String[] args) {
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
```



# 리스트 정렬하기

파이썬의 sort 처럼 ArrayList를 정렬해보자

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
```

- 오름차순 정렬 - Comparator.naturalOrder()

- 내림차순 정렬 - Comparator.reverseOrder()

________________________________________________________________________________________________

# java 문법 연습문제

```java
//프로그래머스 각도기 solution.java (if문/ 논리곱 )
class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (0<angle && angle<90) {
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if (90<angle && angle<180) {
            answer = 3;
        }
        else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
```
