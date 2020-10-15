# Class

***클래스는 객체를 만들어서 사용할 수 있게 만드는 틀과 같은 존재***

**1. Java는 객체 지향 언어 (Object Oriented Programming)**

객체지향 프로그래밍(Object Oriented Programming)은 문제를 여러 개의 객체 단위로 나눠 작업하는 방식을 말합니다. 

 JAVA, C# 등이 대표적인 객체지향 프로그래밍 언어입니다.  


**2. 장점**

특징: 클래스를 이용해 연관 있는 처리부분(함수)과 데이터 부분(변수)를 하나로 묶어 객체(인스턴스)를 생성해 사용

장점: 독립적인 객체 단위로 분리해서 작업할 수 있기 때문에  여러 개발자와 협업해 규모가 큰 프로젝트를 진행할 수 있으며 유지보수측면도 뛰어나다는 장점이 있습니다.

---

```java
public class Cat {
    String name;
    int     age;
    String color;

    Cat() {                // 생성자 constructor

    }

    void run() {
        System.out.println(this.name + "가 달린다");    // 자기를 부르는 것
    }

    void sleep() {
        System.out.println("고양이가 잔다");
    }
}

public class Main {

    public static void main(String[] args) {
		
        Cat c1 = new Cat();
        c1.name = "냥이";
        c1.age  = 6;
        c1.color = "레포드 프린트";

        c1.run();						//냥이가 달린다
        c1.sleep();						//고양이가 잔다

        Cat c2 = new Cat();
        c2.name = "루랑이";
        c2.age  = 4;
        c2.color = "고등어 색깔";

        c2.run();                       //루랑이가 달린다
        c2.sleep();                     //고양이가 잔다
    }
}

```

---

## 접근 제한자
|type|description|
|-|-|
|public|같은 패키지, 다른 패키지 사용가능|
|private|같은 클래스 안에서만 사용가능|
|default|같은 패키지 안에서만 사용가능|
|protected|같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용|

public > protected > default > private

--- 

## this
클래스 단위에 넣기 위해 생성자나, 혹은 그냥 초기값을 설정하기 위해서 제일 많이 쓰인다.

1. class constructor (생성자) 를 사용할 때 보기가 수월하다
2. 이름에 대해서 헷갈리지 않을 수 있다.

밑에 두개의 코드는 같은 코드 이다.

```java
public class Point {
    public int x = 0;
    public int y = 0;

    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
/**********************************************************************************/
public class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```
### this 응용
```java
public class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        this(0, 0, 1, 1);                           // this를 이용한 constructor 부르기
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);                  // this를 이용한 constructor 부르기
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    ...
}
```

---

## static
static 을 사용하면, 객체의 값을 전부 같게함

1. 공통 공간으로 사용
2. 객체 만들 필요 없이 '클래스 이름' 으로 접근,
3. static 속성에서 non-static으로는 접근 불가

​[출처](https://blog.naver.com/ky91zzang/221383327421)

---
VO class (value - object class) : 객체와 오브젝트만 가지는 메소드가 없는 클래스를 일 컫는말.
