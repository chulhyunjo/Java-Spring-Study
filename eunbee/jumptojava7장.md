## 1. static 변수와 메소드

#### 1. static 변수

값이 변하지 않는 경우 static 사용시 메모리 이점을 얻을 수 있음.

```java
class HouseLee {
    static String lastname = "이"; //메모리 할당 딱 한번만 하게 됨 
}

public class Sample {
    public static void main(String[] args) {
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();
    }
}
```

- 변수 공유

```java
class Counter  {
    int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 1
    }
}// 객체 변수는 항상 독립적인 값을 가진다. 
```

static 변수 선언 

```java
class Counter  {
    static int count = 0;
    Counter() {
        count++;  // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count);  // this 제거
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2
    }
}
```

#### 2. static 메소드

```java
class Counter  {
    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());  // 스태틱 메서드는 클래스를 이용하여 호출
    }
}
```

객체 생성 없이 클래스를 통해 매서드 직접 호출 가능

## 3. 싱글톤 패턴

단 하나의 객체만을 생성하게 강제하는 패턴 

=> new 를 이용하여 무수히 많은 객체를 생성하면 안됨 => private

```java
class Singleton {
    private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) { // 객체가 딱 한번만 만들어지도록 함. 
            one = new Singleton();
        }
        return one;
    }
}

public class Sample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // true 출력
    }
}
```














