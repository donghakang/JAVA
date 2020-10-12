# Inheritance 상속

- 객체 지향 프로그래밍에서는 기존의 클래스를 가져다가 소스 코드를 건드리지 않고 추가 되는 부분만 따로 작성해서 새로운 클래스를 만들 수 있음.
- 클래스를 가져다가 확장해서 새로운 클래스를 만드는 기술을 상속 이라고 함.

​
```java
public class Account {
    String accountNo;
    String ownerName;
    int balance;

    void deposit(int amount) { .... }
    int withdraw(int amount) { .... }
}

public class CheckingAccount extends Account {
    int pay(String cardNo, int amount) { ... }
}
```

> **``` public class <서브 클래스> extends <슈퍼 클래스/부모 클래스> ```** 

- 이렇게 되면, 슈퍼 클래스 안에 있는 메소드 와 변수를 마음대로 사용할 수 있다.

​
---
​
### 예시
```java
public class Animal {
	int legs;
	int age;
	String name;
	
	void call() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
public class Dog extends Animal {
	String breed;
	Dog() {
		legs = 4;
		name = "갱얼쥐";
		age  = 15;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void bark() {
		System.out.println("왈왈왈왈왈왈왈왈왈왈왈왈");
	}
	
	void myBreed() {
		System.out.println("이 강아지의 종은 " + this.breed + " 입니다");
	}
}
```
이 경우 Dog 라는 클래스 안에서도, call() 이라는 메소드와, legs, name, age라는 변수를 받을 수 있다.

---

※ 상속 클래스에 생성자가 있을경우, 부모 생성자를 호출!
```java
public class Cat extends Animal {
    public Ant(int age, String name, String breed ) {
        super(age, name);                 // 상속 받은 변수
        this.breed = breed;               // Cat 클래스에 있는 변수
    }
}
```
- 서브클래스에도 무조건 생성자를 만들어야한다.


---

## Override

- 슈퍼클래스에 존재하는 메소드를 수정하거나, 교체할 때 사용

```java
public class Account {
	String name;
	String num;
	int balance;
	public Account(String name, String num, int balance) { ... }
	
    void deposit(int amount) {
		balance += amount;
	}
}

public class CheckingCard extends Account {
    String cardNo; 
	public CheckingCard(String name, String num, int balance, String cardNo) {
		super(name, num, balance);
        this.cardNo = cardNo;
	}

    @Override
    void deposit(int amount) { ... }      // 새로운 일들을 함...
}
```
​
```java
...
    @Override
    void deposit(int amount) {
        super.deposit(amount);           // 부모가 한 일들을 실행
        ...
    }
```

---

### Final

final은 상속을 하지 못하도록 막아야 할 경우 사용된다.
> ``` public final class Account 라는 class는 상속할 수 없다. (public class check extends Account 가 불가능)```
​

### Abstract

형태는 바디가 없는 메소드 형태로 상속을 받은 서브 클래스에서 반드시 오버라이드 해줘야한다.

public abstact void deposit() 이라는 추상 메소드가 있을시, 서브 클래스에서 메소드를 오버라이드 안 할 시 에러가 뜬다. (public class check extends Account --> 이 안에 deposit 없으면 에러)

​
*즉, 상속 받은 클래스에서 무조건 오버라이드 하게해서 이름 규칙을 만들고, 기능을 물려받기 위함이 아니다.*

​

### Account _ = new Check(); 
가능하다! (다향성)

- 부모 클래스는 서브 클래스로 지정을 할 수 있다. 단, 오버라이드한 메소드를 부른다면 (deposit) 서브클래스에 있는 메소드를 사용한다.

​

