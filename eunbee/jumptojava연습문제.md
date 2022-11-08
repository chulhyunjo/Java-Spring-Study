# 1. 평균점수 구하기

```java
import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		int[] score = {80,75,55};
		int num = 0;
		for (int i=0;i < score.length;i++) {
			num += score[i];
		}
		System.out.println(num/score.length);
	}

}
```

# 2. 홀수 짝수 판별하기

```java
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int inputnum;
		Scanner sc = new Scanner(System.in);
		inputnum = sc.nextInt(); 
		if (inputnum%2==1) {
			System.out.println("홀수");
		}
		else {
			System.out.println("짝수");
		}
	}

}


```

- Scanner : 자바에서 입력하고자 할 때 사용하는 클래스 

# 5. replace

```java
public class HelloWorld {
	public static void main(String[] args) {
		String a = "a:b:c:d";
		System.out.println(a.replaceAll(":","#"));
	
	}
}

```

# 6. sort

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class HelloWorld {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
		myList.sort(Comparator.naturalOrder());
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력

	
	}
}
```

# 10. 매직넘버

```java
import java.util.HashMap;

public class HelloWorld {
	enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
	static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
	
	public static void main(String[] args) {
		printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
   
	}
}

```
