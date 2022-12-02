# 2장 자바 시작하기

---

## 2-1. 자바 소스코드의 구조

---

### 자바 소스코드의 구조

---

- Class_name.java (일반적인 자바 소스코드)

```java
/* 클래스 블록 */
public class 클래스명 {

    /* 메소드1 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메소드명1(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    /* 메소드2 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메소드명2(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    ...
}
```

- 클래스 블록
  - 소스코드의 가장 바깥 쪽 영역
  - 클래스명 = 소스파일의 이름(클래스명.java)
  - 메소드 블록들을 포함함

<aside>
💡 public ?

- class 앞에 public을 붙임 → class_name = java_file_name
- public이 없음 → (class_name = java_file_name) or not
- 이는 대표 클래스를 지정하여 코드의 가독성을 높이는 측면에서 비롯되었다.

</aside>

- 메소드 블록
  - `[public | private | protected]`
    - 기재된 3가지 접근 제어자 or not
  - `[static]`
    - static 키워드 or not
    - 정적메소드와 변수에 관련이 있는 키워드 → 자세한 내용은 이후에 다룸
  - `(리턴자료형 | void)`
    - 메소드가 실행된 후 리턴되는 값의 자료형을 의미
    - 만약 리턴값이 없는 경우라면 void로 표기
    - 둘 중 하나는 필수로 표기해야 하기에 소괄호로 표기되있음
  - 메소드 명 이후의 괄호 `( )` 안의 값들
    - 메소드의 입력인자 = “입력자료형” + “매개변수명”

<aside>
💡 접근 제어자 ?

- 변수나 메소드의 사용 권한을 설정할 수 있음
- `private -> default -> protected -> public`  순으로 보다 많은 접근을 허용
- 자세한 내용은 이후에 다룸



</aside>

### 소스코드의 예

---

- Sample.java

```java
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
```

- **클래스 블록**
  - 클래스 블록은 중괄호 `{ }` 로 둘러싸야함
  - `public` 은 자바의 접근제어자
    - 어디서든 이 클래스의 접근할 수 있음을 의미
- **메소드 블록**
  - `static`
    - 이 메소드는 클래스 메소드가 되어 객체를 만들지 않아도 “클래스명.메소드명” 형태로 호출이 가능
  - `void`
    - 리턴값이 없음
  - `String[] args`
    - 메소드의 매개 변수
    - args 변수는 String[ ] 배열 자료형임을 명시
    - args 라는 이름은 관례적인 이름으로 바꿔도 무방함
- **명령문 (Statement)**
  - 반드시 세미콜론(`;`)을 붙여서 Statement의 끝을 표시해야 함



## 2-2. 변수와 자료형

---

### 변수명

---

```java
int a;
String b;
```

- a, b 와 같은 **변수(variable)의 이름** 작성시 주의사항
  1. 변수명은 숫자로 시작할 수 없음
  2. `_` 와 `$` 문자 이외의 특수문자 사용할 수 없음
  3. 자바의 키워드는 변수명으로 사용할 수 없음 (ex: int, class, return 등)



- [참고] 자바의 키워드

```java
abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw
byte      else      import      public     throws
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while
```

 

### 자료형 (Type)

---

- `int a;`
  - “변수 a 는 int 자료형 변수이다.”
  - 즉, a 라는 변수에는 int 자료형 값(예:1, 10, 25등의 정수)만 할당 가능
- `String b;`
  - “변수 b 는 String 자료형 변수이다.”
  - 즉, b라는 변수에는 String 자료형 값(예:”a”, “hello” 등의 문자열)만 할당 가능



### 변수에 값 할당하기

---

```java
// 선언
int a;
String b;

// 할당
a = 1;
b = "hello java";
```

```java
// 선언과 동시에 할당
int a = 1;
String b = "hello java";
```

```java
// 변수에 부적절한 자료형 값 할당
int a = "Hello java";
// Type mismatch: cannot convert from String to int
```

 

### 자주 쓰이는 자료형

---

- 자바에서 가장 많이 쓰이는 자료형
  - int, long, double, boolean, char, String, StringBuffer, List, Map, Set



### 사용자 정의 자료형

---

```java
// 사용자 정의 자료형
class Animal {
}
Animal cat;

// cat이라는 변수는 Animal 자료형 변수이다.
// cat이라는 변수에는 Animal 자료형에 해당되는 값만 할당 가능하다.
```

 

## 2-3. 명명 규칙

---

### 클래스명

---

- 명사로 작성할 것
- 여러개의 단어가 섞이는 경우 각 단어의 첫번째 문자는 대문자로 작성

```java
// 예시
class Cookie {}
class ChocoCookie {}
```

 

### 메소드 명

---

- 동사로 작성할 것
- 클래스명과 마찬가지로 각 단어의 첫번째 문자는 대문자
  - 단, 처음 시작하는 문자는 항상 소문자

```java
// 예시
run();
runFast();
getBackground();
```

 

### 변수 명

---

- 짧고 의미있게 작성
- 순서를 의미하는 임시적인 정수 → i, j, k, m, n
  (문자의 경우 → c, d, e)
- 기호를 변수명의 시작 문자로 사용하지 말 것

```java
// 예시
int i;
char c;
float myWidth;
```

 

## 2-4. 주석

---

### 블럭주석

---

- 소스 코드내에서 한 블록(메소드, 클래스, 일정부분)에 대한 설명에 쓰임

```java
/*
이것은 블록 주석입니다.
*/
```

 

### 라인주석

---

```java
// 이것은 라인 주석입니다.
```


