# Map

Map은 Key Value를 한쌍으로 갖는 자료형이다. (리스트의 dictionary랑 비슷 )

## HashMap

자바 맵중에서 가장 간단함. hashmap 이외에 LinkedHashMap, TreeMap 등이 있음

### 1. put

hashmap에 자료를 key, value 쌍으로 입력

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();//제네릭스  
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}
```

### 2. get

map.get(key)  : key에 해당하는 value값을 얻음

```java
System.out.println(map.get("people"));  // "사람" 출력
```

- getOrDefault : key 에 해당하는 value값이 없으면 null을 리턴하는데 null 대신 기본값을 설정해줌
  
  ```java
  System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
  ```

### 3. containsKey

map에 해당 키가 있는지 여부을 부울형으로 리턴

```java
System.out.println(map.containsKey("people"));  // true 출력
```

### 4. remove

map.remove(key)  실행하면 value 값이 리턴됨

```java
System.out.println(map.remove("people"));  // "사람" 출력
```

### 5. size

map의 갯수를 리턴

```java
System.out.println(map.size());
```

### 6. keySet

map의 모든 키 목록을 모아 리턴

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());  // [baseball, people] 출력
    }
}
```

> - LinkedHashMap:입력된 순서대로 데이터를 저장
> 
> - TreeMap: key의 오름차순 순서로 데이터를 저장




