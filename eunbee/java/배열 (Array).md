# 배열 (Array)

- 배열은 자료형 타입 바로 옆에 [ ]기호를 사용하여 표현한다. 
  
  ```java
  int[] odds = {1,3,5,7,9};
  String[] weeks = {"월","화","수", "목", "금", "토", "일"};
  ```
1. 배열의 길이는 고정되어 있다.
   
   반드시 길이를 설정해야 함
   
   ```java
   String[] weeks = new String[7];
   weeks[0] = "월";
   weeks[1] = "화";
   weeks[2] = "수";
   weeks[3] = "목";
   weeks[4] = "금";
   weeks[5] = "토";
   weeks[6] = "일";
   ```

     길이를 설정하지 않으면? = > 컴파일 오류 발생

2. 배열 값에 접근하는 법
   
   인덱싱 활용 
   
   ```java
   String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
   System.out.println(weeks[3]);
   ```
- 인덱싱을 활용하지 않고 전체를 출력하고자 하면
  
  ```java
  String[] odds = {"1","2"};
  System.out.println(Arrays.asList(odds)); // [1, 2]
  ```

- 만약 그냥 출력한다면?
  
  ```java
  String[] odds = {"1","2"};
  System.out.println(odds);	//[Ljava.lang.String;@1ee0005
  ```

    위와 같이 값이 출력되지 않음

3. 배열의 길이
   
   length를 이용해 구현 
   
   ```java
   String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
   for (int i=0; i<weeks.length; i++) {
       System.out.println(weeks[i]);
   }
   ```
