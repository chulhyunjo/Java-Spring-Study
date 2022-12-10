# 1. 문자열

> - char 와 비교
>   
>   - char a = 'a';            =>  ' ' 단일 인용부호를 사용함
>   
>   - String b = "abc";    =>  "" 이중 인용부호를 사용함



> - 문자열의 두 가지 표현방식
> 
> ```java
> String a = "Happy Java"; //리터럴 표기 , 객체 생
> String a = new String("Happy Java");// 새로운 객체 생성 
> 
> ```

> - new 키워드 => 객체 생성시 사용
> 
> - 리터럴 방법은 객체생성 없이 고정된 값을 그대로 대입
> 
> - 되도록이면 가독성과 컴파일 시 최적화를 위해 첫번째 방법을 권장

## 1) 원시 자료형

> int, long, double, float, boolean, char 등을 원시자료형이라고 한다. 
> 
> - 원시 자료형은 new 키워드로 생성이 불가능 하다. 
>   
>   즉, 리터럴로만 값을 만들 수 있다. 
> 
> - Wrapper 클래스
>   
>   int, long, double, float, boolean, char에  각각 대응하는 
>   
>   Int, Long, Double, Float, Boolean, Char Wrapper 클래스 가 존재
>   
>   Wrapper 클래스는 값 대신 객체를 주고 받을 수 있다. 

## 2) 문자열 내장 메소드

> - equals
>   
>   문자열 동일한지 비교 후 결과 리턴
>   
>   ```java
>   String a = "hello";
>   String b = "java";
>   String c = "hello";
>   System.out.println(a.equals(b)); // false 출력
>   System.out.println(a.equals(c)); // true 출력
>   ```

> ==과 equals의 비교
> 
> == : 동일한 객체인지 판별   (in python => is)
> 
> equals : 같은 값인지 비교    (in python => ==)
> 
> ```java
> String a = "hello";
> String b = new String("hello");
> System.out.println(a.equals(b));  // true
> System.out.println(a == b);  // false
> ```

> - indexOf
> 
>        인덱스는 0에서 부터 시작한다. 
> 
> ```java
> String a = "Hello Java";
> System.out.println(a.indexOf("Java"));  // 6 출력
> ```

> - contains
>   
>   특정 문자열 "포함 여부"를 리턴  (문자열을 입력)
>   
>   ```java
>   String a = "Hello Java";
>   System.out.println(a.contains("Java"));  // true 출력
>   ```

> - charAt
>   
>   특정 위치의 "문자"를 리턴  (인덱스를 입력)
>   
>   ```java
>   String a = "Hello Java";
>   System.out.println(a.charAt(6));  // "J" 출력
>   ```

> - replaceAll
>   
>   특정 문자열을 다른 문자열로 바꾸고자 할 때 사용
>   
>   ```java
>   String a = "Hello Java";
>   System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력
>   ```

> - substring
>   
>   문자열 중 특정 부분을 뽑아낼 경우에 사용(끝위치는 미포함)
>   
>   ```java
>   String a = "Hello Java";
>   System.out.println(a.substring(0, 4));  // Hell 출력
>   ```

> - toUpperCase (toLowerCase)
>   
>   문자열을 모두 대문자(소문자)로 변경할 
>   
>   ```java
>   String a = "Hello Java";
>   System.out.println(a.toUpperCase());  // HELLO JAVA 출력
>   ```

> - split
>   
>   문자열을 특정 구분자로 분리하는 메소드 
>   
>   ```java
>   String a = "a:b:c:d";
>   String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
>   ```

## 3) 문자열 포매팅

> 1. 숫자 대입(%d) 
>    
>    ```java
>    System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
>    
>    // 변수 대입도 가
>    int number = 3;
>    System.out.println(String.format("I eat %d apples.", number));  // "I eat 3 apples." 출력
>    ```

> 2. 문자열 대입(%s)
>    
>    ```java
>    System.out.println(String.format("I eat %s apples.", "five")); // "I eat five apples." 출력변수 대입
>    
>    
>    
>    
>    // 값이 두개 이상일 땐 각 자료형에 맞게 변수 대입
>    int number = 10;
>    String day = "three";
>    
>    // "I ate 10 apples. so I was sick for three days." 출력
>    System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
>    ```

> - 문자열 포맷 코드
>   
>   | %s  | 문자열(String)           |
>   | --- | --------------------- |
>   | %c  | 문자 1개(character)      |
>   | %d  | 정수(Integer)           |
>   | %f  | 부동소수(floating-point)  |
>   | %o  | 8진수                   |
>   | %x  | 16진수                  |
>   | %%  | Literal % (문자 `%` 자체) |

> 따라서 98%를 나타내고 싶으면 %d%이 아닌 %d%%을 해야 함

## 4) 포맷 코드와 숫자

1. 정렬과 공백
   
   %(숫자)s   => 숫자 만큼 왼쪽공백이 발생, -를 붙이면 오른쪽 공백이 발생
   
   ```java
   System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
   System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
   ```

2. 소수점 표현
   
   %.(숫자)f => 숫자만큼 소수점 아래자리를 나타냄
   
   ```java
   System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
   ```

## 5) System.out.printf

- 기존대로 System.out.println을 사용하면 포매팅된 문자열을 리턴할 때, String.format을 반드시 함께 사용해야함

- System.out.printf의 경우 String.format없이도 포매팅된 문자열을 출력함.

- System.out.println   : 문자열을 리턴한다
  
  System.out.printf     : 문자열을 출력한다. 
  
  ```java
  System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
  System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
  ```
