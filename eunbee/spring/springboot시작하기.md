## 1. springboot cli 설치하기

sdkman 이용해서 bash로 설치함. 

## 2. springboot 기본 설정하기

1. spring initializr 이용
   
   <a>https://start.spring.io/</a> 에서 설정 => 설정 알아서 해줘서 편함. 

2. Intellij 이용 -> gradle 이용
   
   ※ 책 참고시 예전 버전으로 기록된 경우가 많은데, build.gradle 파일에서 가장 눈에 보이는 변화는 complie 대신 implementation을 사용한다는 것임.
- gradle 3.0 이상부터는 complie의 사용보다는 implementation 사용을 권장하는데, 
  
  implementation이 빠르고 complie보다 보안상으로 좋음

#### 3. spring initializr 이용하여 기본 설정

- 보통 웹 개발시 추가하는 dependencies => Spring Web, Thymeleaf(template engines)

```java
//build.gradle
// 중략  
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

// 중략  
```

- resource/static/index.html => 웰컴페이지

- <a>[Spring Boot](https://spring.io/projects/spring-boot)</a>=> 공식문서 참고

#### 4. 빌드 및 실행

bash나 cmd에서

1. .\gradlew build

2. cd build/libs

3. java -jar hello-spring(자동완성 됨)

4. 
