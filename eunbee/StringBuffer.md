# 1. StringBuffer

1) append
   
   ```java
   StringBuffer sb = new StringBuffer();
   sb.append("hello");
   sb.append(" ");
   sb.append("jump to java");
   String result = sb.toString();
   System.out.println(result);  //hello jump to java
   ```
- StringBuffer 자료형은 append 메소드를 사용하여 계속해서 문자열을 추가해 나갈 수 있다. 

- toString : String 자료형으로 변경
  
  ```java
  String result = "";
  result += "hello"
  result += " ";
  result += "jump to java";
  System.out.println(result); //hello jump to java
  ```

- 결과값은 동일하지만 내부적으로 객체가 생성되고 메모리가 사용되는 과정은 다름.

- StringBuffer : 객체는 한번만 생성/String 자료보다 무거움(메모리 사용량 up, 속도 느림)/ 한번 생성된 값을 언제든지 수정가능
  
  => 문자열 추가나 변경 등 작업이 많을경우

- String : + 연산이 있을 때마다 새로운 Stirng 객체 생성/ 한번 값이 생성되면 변경불가/
  
  => 문자열 추가나 변경등의 작업이 거의 없는경우
2. insert
   
   ```java
   StringBuffer sb = new StringBuffer();
   sb.append("jump to java");
   sb.insert(0, "hello ");
   System.out.println(sb.toString()); //hello jump to java
   ```

3. substring
   
   ```java
   StringBuffer sb = new StringBuffer();
   sb.append("Hello jump to java");
   System.out.println(sb.substring(0, 4));//Hell
   ```
- String의 substring 메소드와 동일

# 2. StringBuilder

- 사용법은 StringBuffer랑 동일

- StringBuffer: 멀티 스레드 환경에서 안전

- StringBuilder : StringBuffer보다 성능이 우수함/ 동기화를 고려할 필요가 없는 상황에서 유리
