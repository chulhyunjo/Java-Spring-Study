# Set 자료형

- Set: 자료형은 HashSet, TreeSet(오름차순 정렬), LinkedHashSet(입력한 순서대로 값을 정렬) 등이 있다. 
  
  - 집합 자료형은 중복을 허용하지 않으며 순서가 없다 => 인덱싱 미지원
    
    (파이썬과 집합과 개념이 동일함) 

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
    }
}
```

## 집합의 연산

1. 교집합 retainAll
   
   ```java
   import java.util.Arrays;
   import java.util.HashSet;
   
   public class Sample {
       public static void main(String[] args) {
           HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
           HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
   
           HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
           intersection.retainAll(s2);  // 교집합 수행
           System.out.println(intersection);  // [4, 5, 6] 출력
       }
   }
   ```

      만약  intersection을 쓰지 않고 s1을 그대로 쓰면 s1 내용이 변경됨

2. 합집합 addAll
   
   ```java
   import java.util.Arrays;
   import java.util.HashSet;
   
   public class Sample {
       public static void main(String[] args) {
           HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
           HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
   
           HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
           union.addAll(s2); // 합집합 수행
           System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
       }
   }
   ```
   
   중복으로 존재하는 값은 한개씩만 표현한다. 

3. 차집합 removeAll
   
   ```java
   import java.util.Arrays;
   import java.util.HashSet;
   
   public class Sample {
       public static void main(String[] args) {
           HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
           HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
   
           HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
           substract.removeAll(s2); // 차집합 수행
           System.out.println(substract);  // [1, 2, 3] 출력
       }
   }
   ```

## 집합 자료형 관련 메소드

1. add : 집합 자료형에 값을 추가한다. 
   
   ```java
   import java.util.HashSet;
   
   public class Sample {
       public static void main(String[] args) {
           HashSet<String> set = new HashSet<>();
           set.add("Jump");
           set.add("To");
           set.add("Java");
           System.out.println(set);  // [Java, To, Jump] 출력
       }
   }
   ```

2. addAll : 여러개의 값을 한번에 추가할 때(합집합연산)

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
```

3. remove : 특정값을 제거할 때
   
   ```java
   import java.util.Arrays;
   import java.util.HashSet;
   
   public class Sample {
       public static void main(String[] args) {
           HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
           set.remove("To");
           System.out.println(set);  // [Java, Jump] 출력
       }
   }
   ```



# 상수집합(Enum)

서로 관련이 있는 여러 개의 상수집합을 정의할 때 사용하는 자료형

- 매직넘버(프로그래밍이에서 상수로 선언하지 않은 숫자)을 사용할 때보다 명확한 코드사용가능

- 잘못된 값을 사용함으로 인해 발생할 수 있는 위험성이 사라짐. 





# 형변환

- String to int (parseInt)
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          String num = "123";
          int n = Integer.parseInt(num);
          System.out.println(n);  // 123 출력
      }
  }
  ```

- int to String 
  
  1. 정수앞에 빈문자열 더해주기
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          int n = 123;
          String num = "" + n;
          System.out.println(num);  // 123 출력
      }
  }
  ```
  
  2. valueOf, toString 사용
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          int n = 123;
          String num1 = String.valueOf(n);
          String num2 = Integer.toString(n);
          System.out.println(num1);  // 123 출력
          System.out.println(num2);  // 123 출력
      }
  }
  ```

- double, float 자료형
  
  Double.parseDouble,  Float.parseFloat
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          String num = "123.456";
          double d = Double.parseDouble(num);
          System.out.println(d);
      }
  }
  ```

- 정수<=>실수
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          int n1 = 123;
          double d1 = n1;.  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
          System.out.println(d1);  // 123.0 출력
  
          double d2 = 123.456;
          int n2 = (int) d2;. // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
          System.out.println(n2);  // 소숫점이 생략된 123 출력
      }
  }
  ```
  
  실수형태 문자열 ->정수(X) NumberFormatException
  
  ```java
  public class Sample {
      public static void main(String[] args) {
          String num = "123.456";
          int n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.
      }
  }
  ```





## final

자료형에 값을 단 한번만 설정하도록 강제하는 키워드 

```java

```
