# 1. JAVA 시작하기

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}


```



> - <h2>public : 메소드의 접근 제어자를 의미한다.</h2>
>   
>   public은 누구나 이 메소드에 접근할 수 있다는 의미이다. 
>   
>   - 자바의 접근 제어자 
>     
>     1. private : 접근 제어자가 private로 설정 되었다면 private이 붙은 변수,      
>        
>        메소드는 해당 클래스에서만 접근이 가능하다.
>        
>        
>     
>     2. default : 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능하다. 
>     
>     
>     
>     3. protected : protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근 가능하다.
>     
>     4. public : public 접근 제어자가 붙은 변수, 메소드는 어떤 클래스에서든 접근이 가능하다. 
> 
> 
> 
> - static : 메소드에 static이 지정되어 있는 경우 이 메소드는 인스턴스 생성없이 실행할 수 있음을 의미한다. 
> 
> - void : 메소드 리턴값 없음
> 
> - String[]: 문자열을 나타내는 자바의 자료형. []이 있으므로 한개가 아닌 여러개의 값으로 이루어진 배열임을 의미함.
> 
> - args: String[] 자료형에 대한 변수명이다. 
> 
> - System.out.println: 표준출력으로 데이터를 보내는 자바의 내장 메소드로 문자열을 화면에 출력



# 2. 구구단 만들기 (class, for문 )

```java
public class GuGu {

	public void dan(int n) {
		for (int i=1;i<10;i++) {
			System.out.println(n*i);
		
		}	
	}
	public static void main(String[] args) {
		GuGu gugu = new GuGu();   // GuGu class의 객체 생성
		for (int i=2;i<10;i++) {
			String str = new String("단");
			System.out.println(i+str);
			gugu.dan(i);      // 객체를 통해 dan 메소드를 호출  
		}
	}
}
```



> - 자바의 경우 변수 선언시 자료형을 명시한다 (int n)
> 
> - new : 클래스의 객체를 만드는 키워드 

- static 메소드 

```java
public class GuGu {

	public static void dan(int n) {
		for (int i=1;i<10;i++) {
			System.out.println(n*i);
		
		}	
	}
	public static void main(String[] args) {
		for (int i=2;i<10;i++) {
			String str = new String("단");
			System.out.println(i+str);
			dan(i);
		}
	}

}
```



> 위 코드는 바로 위 코드와 출력이 같다. 
> 
> 위와 같이 static 메소드를 사용하면 객체 생성없이 메소드 호출이 가능하다


