
# All about JAVA

---

## Table of Contents

- [All about JAVA](#all-about-java)
  - [Table of Contents](#table-of-contents)
  - [자바프로그램 다운로드/설치](#자바프로그램-다운로드설치)
  - [자바 문법](#자바-문법)
    - [자바의 분류](#자바의-분류)
    - [자바의 **특성** :star:](#자바의-특성-star)
    - [JVM (Java Virtual Machine)의 메모리](#jvm-java-virtual-machine의-메모리)
    - [자바의 실행 과정](#자바의-실행-과정)
    - [사용자 정의 명칭 (클래스, Method, Field)](#사용자-정의-명칭-클래스-method-field)
    - [변수/상수](#변수상수)
  - [④실수형상수](#④실수형상수)
    - [데이터타입](#데이터타입)
    - [연산자](#연산자)
    - [제어문](#제어문)
    - [메서드(Method)](#메서드method)
    - [배열](#배열)
    - [난수 함수](#난수-함수)
    - [패키지(package)처리](#패키지package처리)
    - [객체지향프로그래밍](#객체지향프로그래밍)
    - [함수 오버로딩 overloading](#함수-오버로딩-overloading)
    - [생성자 constructor](#생성자-constructor)
    - [Garbage Collection](#garbage-collection)
    - [다중 클래스](#다중-클래스)
    - [상속 inheritance](#상속-inheritance)
    - [this 예약어](#this-예약어)
    - [메서드 오버로딩 Overload Function](#메서드-오버로딩-overload-function)
    - [메서드 오버라이딩 Override Function](#메서드-오버라이딩-override-function)
    - [static](#static)
    - [final](#final)
    - [super](#super)
    - [접근지정자 접근제한자](#접근지정자-접근제한자)
    - [추상 클래스](#추상-클래스)
    - [예외 처리](#예외-처리)
    - [Polymorphism 다형성](#polymorphism-다형성)
    - [Interface 인터페이스](#interface-인터페이스)
    - [instance of 연산자](#instance-of-연산자)
    - [자바의 중요한 클래스](#자바의-중요한-클래스)
    - [Collections 컬렉션](#collections-컬렉션)
    - [Java DataBase Connectivity](#java-database-connectivity)
    - [AWT](#awt)
    - [IO](#io)

---

## 자바프로그램 다운로드/설치

자바 다운로드 : [java.oracle.com](java.oracle.com) :arrow_right:  jdk-8u25-windows-i586.exe

1. JDK설치(기본설정)
    C:\Program Files\Java\jdk1.8.0_131
    C:\Program Files\Java\jre1.8.0_131

2. 내PC->속성->고급시스템설정->고급(탭) -> 환경변수->시스템변수
    1. 새로만들기
        변수이름 : JAVA_HOME
        변수   값 : C:\Program Files\Java\jdk1.8.0_131
    2. Path 
          %JAVA_HOME%\bin (맨 마지막에 추가입력)

3. cmd창을 띄우고 테스트하기
  ```$ java -version```
  ```$ javac```
     (화면에 도움말이 쭉~~ 올라가면 성공)

4. 도움말(API) 사이트
http://docs.oracle.com/javase/8/docs/api/

5. 인터넷에서 EditPlus를 검색해서 다운로드한후 설치 할것

6. eclipse 다운로드
www.eclipse.org에서 다운 받기

7. eclipse UML설치
help -> Install New Software ->Add
Name : ObjectAid UML Explorer
URL : http://www.objectaid.com/update/current

8. eXERD설치
help -> Install New Software ->Add
Name : exerd
URL : http://exerd.com/update

9. eclipse에서 database developer셋팅할때
    1. 드라이버설치 : 
        C:\Program Files\Java\jdk1.8.0_91\jre\lib\ext  폴더에
        ojdbc6.jar 

    2. 메뉴->window->open perspective -> database development    
        Database Conections(오른버튼) -> New -> Oracle(선택) -> Next
        -> Drivers(별모양클릭) -> Name/Type :Oracle Thin Driver (11버젼) 선택
        -> JAR List(ojdbc14.jar를 삭제) 한후 Add JAR/Zip을 클릭해서 
            C:\Program Files\Java\jdk1.8.0_91\jre\lib\ext 에 있는 ojdbc6.jar를 선택한다 -> OK

    3. Properties   
     - SID : xe
     - host: 127.0.0.1
     - port number : 1521
     - user name : scott
     - password : tiger

     입력한후에 Test Connection을 클릭하면 ping successed뜨면 성공

※ Eclipse 단축키
|keyboard|description|
|-|-|
|```ctrl + space```|자동완성기능|
|```ctrl + 1```|import 또는 예외처리|
|```ctrl + shift + o```|모든 클래스 자동 import| 
|```ctrl + shift + / 또는  \```|주석처리(여러줄)|
|```ctrl + shift + c```|주석처리(한줄)|
|```ctrl + shift + f```|자동정렬|

---


## 자바 문법

### 자바의 분류
   - J2SE(Java SE)  : Java2 Standard Edition
   - J2EE(Java EE)  : Java2 Enterprise Edition(web관련)
   - J2ME(Java ME)  : Java2 Micro Edition(모바일관련)

---

### 자바의 **특성** :star:
    1. 이식성이 높다
    2. 단순하고 견고한 언어
         - C++언어와 비슷한 구문사용
         - 다중상속, 구조체, 전역변수, 연산자 중복기능등을 제거하여 언어의 복잡성을 제거
         - 자동적으로 쓰레기처리
            i)메모리포인터를 사용하지 않는다(내부포인터사용)
            ii)사용되지않는 메모리를 자동으로 회수
         - 명시적 선언 및 엄격한 형검사   float a=10.4f;
         - 예외처리
   3. 완벽한 객체지향 언어이다
      - 프로그램의 재사용, 생산성향상
      - 설계 단계부터 객체지향 개념을 고려
   4. 분산환경에 적합한 언어
      - TCP/IP 네트워킹 기능을 내장
   5. 안전한 언어
      - 바이트 코드 검증기를 통해 코드를 검증
      - Java애플릿이 클라이언트에서 실행될때 사용할수 없는 기능의 리스트가 된다
   6. 다중 쓰레드 지원
       -다중쓰레드 : 여러개의 작업을 동시에 실행할수 있는 기능
       -스레드와 관련된 라이브러리 클래스 제공
   7. 동적인 언어
       -기존프로그램의 영향을 미치지 않고 라이브러리에 새로운 메소드나 속성을 추가할수 있다

---

### JVM (Java Virtual Machine)의 메모리
   * 스택 영역 (Runtime Stack) : 실행시 사용하는 메모리 영역
   * 힙 영역 (Garbage Collection Heap) : 동적 메모리 할당 영역
   * 상수 영역 (Constant & Code Segment) : 상수 데이터 및 static 데이터 할당 영역
   * 레지스터 영역 (Process Register) : 프로세서 실행 관련 메모리 할당 영역

---

### 자바의 실행 과정
   * ```*.java 파일``` :arrow_right: ```컴파일(javac)``` :arrow_right: ```*.class 파일``` :arrow_right: ```인터프리터(java)``` :arrow_right: 실행 결과
   * ```javac 파일명.확장명```   <---- 컴파일
   * ```$ java 파일명```           <---- 실행

---

### 사용자 정의 명칭 (클래스, Method, Field)
(1)첫 글자는 ‘_’, ‘$’, 영문 대,소문자 (한글 가능)
(2)글자수에 제한 없다.
(3)공백문자 및 특수 문자 사용 불가
(4)숫자는 첫 글자가 아닐 때 사용 가능
(5)예약어 사용 불가
(6)기타 단순 약속 (대, 소문자의 규칙)
   int a=10, A=20;   (O)
   int _a=100;          (O)
   int 100a=15;       (X)
   int kor25=100;    (O)
   int k g h = 50;    (X)
   int System=100;  (X)
    
    * 예약어
:자바언어 자체가 사용하기 위해 예약해 놓은 식별자가 있다 
ex)if, for, try, extends.......
<br>a. 클래스이름과 파일명은 반드시 동일해야 함
    b. 컴파일이나 실행할때도 를 구별함 

---

### 변수/상수

1. 변수
기본데이타형변수 / 참조형변수
(primitive type)      (reference type)

※종류가 다른 데이터형의 변환
                                      수치형   ----  정수형 (byte, char, short, int,long)
                                         ↑      ----  실수형 (float, double)
                                        (X)         
                      기본형          ↓ 
   자바                ↑            논리형   ---- boolean
                         (X)
데이타형             ↓
                     레퍼런스형   -  클래스 (String...)
                                       -  인터페이스
                                       -  배열
                  - 
---------------------------------------------------------------------------------
[형변환 우선순위]
byte  → short  ↘
                          int  →  long → float → double 
            char   ↗

ex) int a=100;
     long b=a;         // a값을 long으로 형변환(자동)

     long a=123456;
     int b=(int)a;     // a값을 int로 형변환(강제)
---------------------------------------------------------------------------------
    2. 상수
①논리형상수 : true/ false
②문자형상수 : '   '  (단일따옴표) - 문자    
                     "   "   (이중따옴표) - 문자열
    개행문자(New Line) : \n
    리턴(Return)           : \r  -- 커서를 맨앞쪽으로 이동
    탭(Tab)                  : \t  -- 8칸띄우기
    백스페이스             : \b
    null                       : \0 (아무것도없다)
③정수형상수
④실수형상수
---------------------------------------------------------------------------------

---

### 데이터타입
1. 기본형
   * 정수:  
     * byte(1)   : -128 ~ + 127
     * short(2)  : -32768 ~ +32767
     * int (4)    : -2147483648~ +2147483647(default)
     * long(8) 
   * 실수 : 
     * float(4)
       * ex) ```float kk = 34.67f;```
     * double(8) - default
   * 문자 : 
     * char(2) : 0~65535    
       * ex) ```char g='M';```   ```char g='남';```
   * 논리 : 
     * boolean   :arrow_right: 형변환 안됨(true/false)
       * ex) ```boolean  sw = false;```

2. 객체형(클래스)
     * String :문자열
        ```java
        import java.io.*; 
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader(sr);

        int a = Integer.parseInt(s.readLine());
        double b = Double.parseDouble(s.readLine());   "190.3"   --> 190.3
        float  c = Float.parseFloat(s.readLine());
        //객체형클래스 -> 기본형(wrapper클래스)
        ```

     * System
	    ```java
        System.out.println("이름 : "+ name);
        System.out.printf("이름 : %s" , name);   //jdk1.5버전 이상
        System.out.println("이름: %s    나이:%d    성적:%.2f", name, age, score);
        ```
        |printf type|description|
        |-|-|
        |```%s```|문자열(String)|
        |```%d```|정수(byte, short, int, long)|
        |```%f```|실수(float, double)|
        |```%c```|문자(char)|
        |```%-10s,   %5d,    %10.2f```|(자릿수 맞출때)|

---

### 연산자

1. 산술 : +, -, *, /,  %(나머지) - int형만 가능    
          ex)5 % 3 ===> 2  /  5 / 2 ===> 2  /   5.0 / 2 ===> 2.5

2. 관계 : ==, !=(같지않다), >=, <=, >, < 

          a=3(대입)    a==3(조건 ,비교)

	  ex) if(a==3)

3. 논리 : ||(or연산) ,    &&(and연산),      ! (not연산) 

4. 증감 : ++, --
    * ++a;  --a;  (전치 : 연산후 사용)   // a=a+1동일 -> ++a표현
    * a++;  a--;  (후치 : 사용후 연산)
        ```java
        int  a=5;
        System.out.println(++a);  // ---> 6  (1증가  6을사용)

	    int  a=5;
        System.out.println(a++);  // ---> 5  (5를 사용하고 1증가)
        ```
    * ! ++5;              ---> 사용할수 X, 상수에는 사용할수 없다    

5. 대입 : =, +=, -=, *=, %=
    ex)
    ```java
    a += b;       a = a + b;
    a -= b;       a = a - b;
    a *= b;       a = a * b;
    a %= b;       a = a % b;
    ```
    ```java
    int a=10;
    int b=5;
    a+=b;        // a -> 15,  b -> 5
    ```      

6. 
   * 비트단위논리연산 : ``` &```, ```|```, ```^```(Exclusive-OR), ```~```(0 <==>1)
   * Shift연산자 : ```>>```, ```<<```

7. 조건(삼항) : 간단한 if문
   * (형식)조건식  ?  참일때  :  거짓일때;
    ```java
    int a=3;
    String rs=(a==3)?"success":"fail";
    ```

8. 단항연산자 : ```-``` ,```+```, ```++```, ```--```, ```!```
     ex) ```-a``` ,    ```++a``` ,    ```!a```

     ex)
     ```java   
    int a=-5;
    System.out.println(-a);     // 5    (-1 * -5 = 5)

    int a=-5;
    System.out.println(+a);     // -5    (+1 * -5 = -5)
    ```
  

**연산자의 우선순위**
( ) :arrow_right: 단항연산자 :arrow_right: 산술연산자 :arrow_right: 관계연산자 :arrow_right: 논리연산자
```!``` , ```+```, ```-```, ```++```, ```--```      ```*``` , ```/```  :arrow_right: ```+``` , ```-```                     ```&&``` :arrow_right: ```||```

ex) 
``` 
5 + 2 * 3 = 11
(5 + 2) * 3 = 21
``` 

9. ASCII코드 (범위 : 0~125)   7bit
   * A   ---  1000001  -- 65
   * B   ---  1000010  -- 66

|examples|ASCII Code|
|-|-|
|A | 65|
|a | 97|
|공백(space) | 32|
|경고음 | 7|
|Enter | 13|                    
|New Line | 10 (맨 앞줄로이동)|
|1  |  49|

---

### 제어문

1. if if - else, if - else if - else 
   * 조건에 맞으면 실행하고 그렇지 않으면 실행하지 않는다

    ```java
    if(조건식)    //실행문이 2문장 이상일때 반드시 { }해야함
    {
        실행문1;
        실행문2;
    }
    실행문3;
    ```   

    ```java
    if(조건식)
        참일때; 
    else
        거짓일때;  
    ```

    ```java
    if(조건식)
        참일때;
    else if(조건식)
     참일때;
        :
    else
        거짓일때;
    ```


     
2. 선택문
   * switch(값)  
     * 정수(char, byte, short, int), 
     * 문자열(String), long(안됨) :arrow_right: jdk 1.7이상
    ```java
    switch(값) {
       case 값1 : 실행문 ;  break;
       case 값2 : 실행문 ;  break;
                         :
                         :
       default:  실행문;
    }

3. while문 (조건반복문)
    ```JAVA
    while(조건식)
    {
       실행문;       //조건이 만족하면 실행
    }
    ```

    ```JAVA
    do {
       실행문;          //실행한후 조건 비교
    } while(조건식); 
    ```

4. for문 (무조건반복문)
    ```java
    // 단일 for 문
    for(int i=1; i<=10; i+=3)   // 1  4  7  10 
    {
    }
    ```
    
    ```java
    // 다중 for 문
    for(초기값; 조건식; 증감식) {
        for(초기값; 조건식; 증감식) {
        }
    }
    ```

    ```java
    // for each
    for(자료형 변수 : 배열명)   // 데이타가 없을때까지 반복(jdk1.5이상)
    {
    }

    for (int a : intArr) {
        ...
    }
    ```

5. break / continue
   * ```break```: 블럭 탈출
   * ```continue```: loop 문에서 더이상 이후 실행문을 진행할 필요 없이, 다음 loop을 진행시키고자 할때

---

### 메서드(Method)

> 반복되는작업을 처리, 프로그램 수정,삭제가 용이하고 보기쉽다

1. 값에 의한 전달(Call By Value)
   - 기본데이타형  
    (byte, short, int, long, float, double, char, boolean)
2. 참조에 의한전달(Call By Reference)
   - 추상 데이터형 
     (배열, 객체)

[형식]
  - 접근지정자 결과형 함수명();
    * void, int ,float, double........   (void : 리턴값이 없다) 
    * 접근지정자: public, private, protectedm default	
  - 결과형
    * return;          //생략가능
    * return 변수; 
    * return 수식;
    * return  값;
    * (주의 :  return은 1개만 가능)
    *  
    ```java
    return a,b,c;      (X)
    return a;
    return 2+3;
    return "abc";
    ```

[유형]
1. static method(클래스메서드)
> 객체생성없이 메서드를 호출
   - 형식)  
     1. 클래스명.메서드명
     2. 메서드명
     3. 객체명.메서드명 

1. non-static method(인스턴스메서드)
> 객체생성후에만 메서드가 호출
   - 형식) 객체명.메서드명 

---

### 배열

> 자료형이 같은 데이타들의 모임

1. 1차원배열
    ```java
    int[] a;                 // 배열선언
    a = new int[5];           // 배열에 동적메모리할당(heap)

    a[0]=10;                  // 배열요소이용
    a[1]=20;
    ```
 
    ```java
    int[] a = new int[5];
    ```

    ```java
    int[] a;
    a = new int[] {1,2,3,4,5};
    ```

    ```java
    int[] a = {1,2,3,4,5};
    ```

2. 2차원배열
    자료형[][] 배열명;    or   자료형 배열명[][];
    ```java
    int [][]data = new int[3][4];
    ```
    ```java
    int [][]data;
    data= new int[3][4];
    ```
    ```java
    int [][]data={{10,40,70,100},{20,50,80,110},{30,60,90,120}};
    ```


3. 가변배열(참조형으로 처리)
    > 행 또는 면의 크기가 가변적인것

    (형식)자료형 [][]배열명 = new 자료형[첨자][];
    ```java
    int [][]num = new int[3][];
	num[0] = new int[3];
	num[1] = new int[2];
	num[2] = new int[4];
    ```
    ```java
    int [][]num = new int[3][];
	num[0] = new int[]{1,2};
	num[1] = new int[]{3,4,5};
	num[2] = new int[]{6,7,8,9};
    ```

★참조형(Reference Type)
>  기본형변수는 해당 변수가 위치한 곳에 값을 보관하고 있다. 
> 하지만, 참조형은 값이 저장된 곳의 위치정보를 알고 있는 변수이다.
> 
> 결국, 기본형은 변수의 위치와 값이 저장된위치가 동일한 반면, 참조형은 값이 저장된 위치와 변수의 위치가 다르다.
> 
> 참조라는 말은 주소(Address)라고도 말할수 있다. 

4. 오브젝트(클래스) 배열
    ```java
    클래스명 []object명 = new 클래스명[첨자];
    object명[0] = new 클래스명(인자, 인자..);
    ```
---

### 난수 함수

> 컴퓨터가 임의의 수를 발생

    ```java
    import java.util.Random;
    Random 변수1 = new Random();
    int 변수2 = 변수1.nextInt(최댓값);    // 0 - (최댓값 - 1)
    ```
    ```java
    System.out.println(Math.random())    // 0 - 0.99999999
    System.out.println((int)(Math.random()*10+1));  // 1 - 10
    ```

---

### 패키지(package)처리

```
$ javac  -d  .  파일명.java   <---컴파일
$ java   패키지명/파일명      <--- 실행
```

---

### 객체지향프로그래밍

> OOP : Object Oriented Programming

:star: 자바의 메모리구조
   * OS에 의하여 프로그램이 수행되면 JVM은 OS로부터 적절한 크기의 메모리공간을 얻어내게 된다. 그리고 얻어낸 메모리 공간을 JVM은 3영역으로 나누어 관리한다
     1. 메소드(method area)영역
          * 메소드의byte코드 ,클래스의 전역변수,static 멤버변수
     2. 스택(Stack)
          * 매개변수, 지역변수 (메소드의 실행이 종료되면 자동반환)
     3. 힙(Heap)
          * 클래스객체, 배열객체, 문자열객체
          * (new연산자 사용, 객체가 사용하는 메모리공간)

:star: 객체지향의 중요한 3가지
   1.  캡슐화(Encapsulation)
       * 데이터보호, 재사용성  - 데이터은닉화
   2.  상속성(Inheritance)
       * 이미 만들어진 코드에 새로운 코드를 추가
       * (프로그램 개발속도 증진, 프로그램 전체의 오류를 방지)
   3. 다형성(Polymorphism)
       * 상속받은것을 그대로 사용하지 않고 사용자 입맛에 맞게 바꾸어 사용
    
---

### 함수 오버로딩 overloading

> 같은 이름의 함수를 여러번 구현 할 수 있다.

함수의 이름을 절약하기 위해 사용한다.
1. 매개변수의 갯수가 다름
2. 매개변수의 자료형이 다름
3. 리턴 타입은 오버로딩 성립에 영향을 주지 않는다.

이 중 int add(int a){} 와 오버로딩이 되지 않는것은? 
   1. int  add(int a ,int b){}
   2. void  add(float  a, float b){}
   3. *void add(int k){}*
   4. int add(char k){}

---

### 생성자 constructor

> 객체가 만들어지면서 자동호출하는 함수이며, 	
      객체의 초기작업을 할 경우에 이용 된다.

1. 반드시 클래명과 동일해야 한다.
2. 결과형(리턴값)이 없다 .
3. 객체가 생성될때 자동 호출되며, 사용자가 임의로 호출할수 없다
4. 멤버필드의 값을 초기화 한다
5. 생략하면 컴파일시 자동으로 default생성자를 만든다
6. 여러개의 생성자를 만들수 있다(생성자 overloading)
7. 생성자내부에서 첫번째라인에 this(매개변수)를 사용하여 다른 생성자를 호출할수 있다. 단, 1번만 호출이 가능하다

|type|description|
|-|-|
|this()|자기 클래스의 디폴트생성자호출|
|this(변수)|자기 클래스의 인자값을 가진 다른생성자호출|
|this.필드명|자기 클래스의 변수를 지칭|
|this.메서드명()|자기 클래스의 메서드를 지칭|

---

### Garbage Collection

> C언어의 소멸자 개념으로  new로 할당된 메모리를 JVM스스로 삭제한다.
> **프로그래머는 신경쓸 필요 없다.**

---

### 다중 클래스

> 하나의 파일에서 여러개의 클래스를 만들수 있음
> (단, public class는 하나만 존재, main()메소드가 있는 클래스에)

---

### 상속 inheritance

> 코드의 재사용 및 간결성을 위해 사용된다
> 기존의 클래스(Super, Parent)라하고 확장하여 새롭게 정의한 클래스를 (Sub, Child)라 부른다. 
> 다중상속 안된다. (C++ 는 가능, interface로 구현 가능)

```java
class 부모클래스 {
    ...
}
class 자식클래스 extends 부모클래스 {
    ...
}
```

---

### this 예약어

> this 예약어는 자신의 오브젝트를 가리키는 예약어

1. 자신의 오브젝트속에 존재하는 멤버변수를 가리킬때
```java
this.멤버변수   // 주로 매개변수이름과 동일할때 구별목적으로 사용
this.메소드()
```

2. 생성자 내부에서 자신의 클래스의 또 다른 생성자를 지칭하는 메소드
```java
this(값);
// 반드시 생성자속의 첫번째 문장으로 1번만 기재
```

---

### 메서드 오버로딩 Overload Function

> 하나의 클래스에서 같은 이름의 메서드가 여러번 구현된경우

1. 메서드의 이름이 같아야 한다
2. 매개변수의 갯수또는 타입이 달라야 한다
3. 매개변수는 같고 리턴타입이 다른경우는 오버로딩이 성립되지 않는다 (리턴타입은 오버로딩을 구현하는데 아무런 영향을주지 못한다)
<br>
    ex)  void  show(int a,int b){ }와  오버로딩인 메서드는? 2,3,4
           ①int   show(int a,int b){ }
           **②void  show(double a,double b){ }**
           **③void  show(int a){ }**
           **④int   show(char a){ }**

---

### 메서드 오버라이딩 Override Function

> 선조클래스와 후손클래스에 같은 이름의 함수가 존재하는경우
> 선조클래스로부터 상속받은 메서드의 내용을 변경하는것을 오버라이딩(재정의)이라고함

1. 이름이 같아야한다   
2. 매개변수의 갯수와 타입이 같아야한다
3. 리턴타입이 같아야한다 (리턴타입이 다른경우는 overriding이 아님)
<br>              
    ex)  void  show(int a,int b){ }와  오버라이딩 메서드인 것은?
           ①int   show(int a,int b){ }
           ②void  show(double a,double b){ }
           **③void  show(int k,int s){ }**
           ④int   show(char a){ }

---

### static 

> 공유 필드를 위한 static

1. static 필드 :데이타 값의 공유를 위해 선언하는 공간(멤버필드만 가능)
   1. 클래스이름으로 접근가능
   2. 객체발생전 메모리할당
   * 클래스명.멤버변수 or 객체명.멤버변수
2. static 초기화영역
    * static { 초기화 구문; }
3. static 메서드
    * static 필드를 컨트롤 할 목적으로 쓰임

---

### final

1. final Field
   > 상수값이 저장될 공간으로 값이 변경될수 없음
    (지역변수, 멤버필드 모두 사용가능)
    ```java
    final int a = 10;
    a = 20;          // X

    final double PI = 3.141592;
    final int PWD = 1234;
    ```
2. final 메서드
   > 상속시 오버라이딩 되지 않아야할 메서드 지정
   (overriding 하게되면 error 발생)

---

### super

1. 반드시 생성자속의 첫번째 문장으로 기재(1번만 기재)
2. 후손생성자속에서 선조생성자를 호출하면서 값을 올려줌
   ```java
   super() // 생략가능
   super(인자, 인자);  
   super.메소드();
   ```

---

### 접근지정자 접근제한자
|type|description|
|-|-|
|```private```| 하나의 클래스내에서만 사용가능한 멤버지정|
|```default/package```|동일파일 + 동일폴더|
|```protected```|동일파일 + 동일폴더 + 상속|
|```public```|객체를 가진 모든 영역|

public >  protected > default(생략) > private

<table style="text-align: center; vertical-align: middle;">
    <tr>
        <td> 
        <td style="text-align: center; vertical-align: middle;" colspan=3> 같은 패키지
        <td style="text-align: center; vertical-align: middle;" colspan=2> 다른 패키지
    </tr>
    <tr>
        <th> 
        <td> 같은 클래스
        <td> 다른 클래스
        <td> 상속
        <td> 클래스
        <td> 상속
    </tr>
    <tr>
        <th> public
        <td> O
        <td> O
        <td> O
        <td> O
        <td> O
    </tr>
    <tr>
        <th> protected
        <td> O
        <td> O
        <td> O
        <td> X
        <td> O
    </tr>
    <tr>
        <th> default
        <td> O
        <td> O
        <td> O
        <td> X
        <td> X
    </tr>
    <tr>
        <th> private
        <td> O
        <td> X
        <td> X
        <td> X
        <td> X
    </tr>
</table>

---

### 추상 클래스

1. 추상클래스 (abstract class)란?
   - 내용이 구현되어 있지 않는 메소드가 1개라도 존재하면 추상클래스라고 한다
    ```java
    public void view() { }           // 구현 O
    abstract public void view() {  } // 구현 X
    ```

   - 추상 메서드가 없어도 추상 클래스를 만들 수 있다.
   - 자기 자신으로 객체 생성이 불가능 하다 
    ```java
    ABC ob = new ABC();   // 객체생성 X
    ```
   - 하위 클래스들이 특정메소드(추상메소드)를 반드시 강제 overriding 하기 위함이다.
2. 추상클래스를 사용하는 이유
   > 메서드의 일관성을 유지하기 위해서이다
3. 추상클래스 사용방법
    ```java
    abstrct class 클래스이름 {
        abstract 리턴타입 추상메소드이름();
    }
    ```

---

### 예외 처리
> 비교적 가벼운 에러로 에러 발생할것을 미리 예측하여 처리하는것

* Unchecked Exception (필요한 경우 예외 처리 수행)
  * ```ArithmeticException```, ```NullPointException```, ```ArrayIndexOutOfBoundsException```
* Checked Exception (강제로 예외처리를 수행)
  * ```IOException```,```FileNotFoundException```

1. ```throws```예약어
    - 예외객체를 양도
    - 예외상황을 다음 문장으로 전가
2. ```try {  } catch {  }```
    - 예외가 발생하면 예외객체를 잡아내어 원하는 동작을 수행
    - 예외상황을 처리하고 다음문장 수행
3. ```try{   }catch{   }finally{   }```
    - 예외가 발생하든 안하든 finally는 무조건수행
    - return 을 해도 finally는 수행
4. ```throw```
    - 예외 강제 발생

|type|description|
|-|-|
|```Exception```|모든 예외상황|
|```IOException```|입.출력에 관련된 예외|
|```NumberFormatException```|숫자가 아닌 문자가 입력되는 예외|
|```ArithmeticException```|0으로나누는 예외|
|```ArrayIndexOutOfBoundsException```|배열초과|

---

### Polymorphism 다형성

> super(부모)클래스와 sub(자식)클래스에 동일한 이름의 함수가 존재(Overriding)할 경우 super클래스의 참조변수로 sub클래스의 인스턴스를 참조할수 있다

--- 

### Interface 인터페이스
**다중상속가능**
> 자바는 단일상속만 지원하는데 이 단점을 보완하기 위해 나온 것

- 조건
  - 추상클래스와 달리 모든 메소드가 추상메소드이다.
  - 모든 변수가 final이어야 한다  


1. 인터페이스의 특징
    <table style="text-align: center; vertical-align: middle;">
        <tr>
            <td> 
            <th style="text-align: center; vertical-align: middle;"> 클래스
            <th style="text-align: center; vertical-align: middle;"> 인터페이스
        </tr>
        <tr>
            <th> 키워드
            <td> class
            <td> interface
        </tr>
        <tr>
            <th> 상속
            <td> extends
            <td> implements
        </tr>
        <tr>
            <th> 함수
            <td> 일반, abstract
            <td> abstract (모두 다)
        </tr>
        <tr>
            <th> 변수
            <td> 일반, final
            <td> final (모두 다)
        </tr>
        <tr>
            <th> 상속
            <td> 단일 상속
            <td> 단일, 다중 상속
        </tr>
        <tr>
            <th> abstract
            <td> 생략 X
            <td> 생략 O
        </tr>
        <tr>
            <th> final
            <td> 생략 X
            <td> 생략 O
        </tr>
    </table>
    
    - class 대신에 interface 키워드 사용.
    - 멤버변수는 상수로 선언.즉 final 키워드를 사용한다는 것이고   변경할 수 없다(final은 생략가능.)
    - 멤버메소드는 몸통이 없음. 즉 abstract메소드이고 모든 메소드가  abstract이므로 생략가능.
    - 부모의 인터페이스를 상속받을시는 extends 대신 implements 키워드 사용.

2. 인터페이스 형식
   ```java
    public interface 인터페이스이름 {
            // 상수선언. 상수선언이라 함은 final 키워드를 쓰는것.
            // 이름뿐인 메소드 선언
    }
   ```
        
---

### instance of 연산자
> 상속관계에서 부모와 자식관계인지 여부를 판단하는 연산자이다.
> 다른형태의 하위객체들이 한 부모를 상속받았을 경우에 어떤 클래스 인지 알아낼수 있다

```java
// BB,CC가 모두 AA를 상속받았을 경우
AA  a  <----- BB  b
       <----- CC  c    

if( c instanceof  AA)     // true (자식 is-a 부모)
if( b instanceof  BB)     // true
if( c instanceof  BB)     // error
if( a instanceof  CC)     // false
```

--- 

### 자바의 중요한 클래스

1. String Class
   - 불변객체 (immutable)

        |functions|description|
        |-|-|
        |```concat(str)```|str설정된 문자열 결합|
        |```substring(n1,n2)```|n1과 n2 사이의 문자열 반환|
        |```toUpperCase()```|대문자로바꾸기|
        |```equals()```|문자열비교|
        |```charAt()```|특정위치의 문자를 리턴|
2. StringBuffer
   - 가변객체 (mutable)
        |functions|description|
        |-|-|
        |```append()```|추가|
        |```reverse()```|꺼꾸로출력|
        |```delete()```|삭제|
        |```length()```|문자열의길이|
        |```capacity()```|버퍼의size (기본:16byte)|

3. StringTokenizer
    - 127.0.0.1 #9000 #뽀로로
        |functions|description|
        |-|-|
        |```countTokens()```|문자열에 있는 토큰의 갯수반환|
        |```nextToken()```|다음 토큰 문자열을 반환|
        |```hasMoreElements()```|토큰이 있으면 true,없으면 false반환|

4. Calendar
   - 날짜나 시간을 나타내는 클래스

5. Random
   - ```import java.util.Random;```
   - int 변수 = new Random().nextInt(최댓값);

---

### Collections 컬렉션

1. Collection Framework 이란?
   - 다수의 데이터를 쉽게 처리할수 있는 표준화된 방법을 제공하는 클래스들 크게 **List, Set, Map**의 3가지 타입의 컨테이너를 제공한다
2. Collection 특징
   - 객체를 저장할때마다 크기가 자동으로 늘어난다.
   - **set**: 중복을 허용하지 않고,추가되는 순서를 유지하지 않는다
   - **List**: 중복을 허용하고, 추가되는 순서를 유지한다
   - **Map**: 키와 값의 쌍으로 저장된다(키와 값이 모두 객체이어야 한다) (java.util   package에 있다)
3. 배열과 Collection
    <table style="text-align: center; vertical-align: middle;">
        <tr>
            <td> 
            <th style="text-align: center; vertical-align: middle;"> 배열
            <th style="text-align: center; vertical-align: middle;"> 컬렉션
        </tr>
        <tr>
            <th> 장점
            <td style="text-align: left";> - 객체를 저장하는데 가장 효율적 <br> - 사용상의 편의성
            <td style="text-align: left";> - 자동으로 크기 조절 <br> - 객체 저장시 다양하고 편리한 기능제공 <br> - 표준화된 interface 기반 설계
        </tr>
        <tr>
            <th> 단점
            <td style="text-align: left";> - 고정된 크기만 제공
            <td style="text-align: left";> - 다소 복잡한 사용방법
        </tr>
    </table>

4. 제네릭스
    > 자바에서 타입에 관련된 것은 제네릭스와 연관을 갖는다

    - 도입 배경
      - Collection클래스에 서로 다른 객체를 저장하는 것에 대한 제한불가
      - 컴파일 하는 도중 타입 확인이 불가능하다
      - 저장된 객체를 사용시에는 반드시 캐스팅해야한다 (ClassCastException과 같은 런타임 오류를 발생)
    - 제네릭스 특징
      - Collection 선언시에< >안에 매개변수타입을선언, 컴파일러에게 사용타입을 전달
      - 캐스팅이 필요없고, 보다 안전한 코드를 작성할수 있다
      - 메소드가 받아들일수 있는 타입을 제한 함으로써 에러검사, 타입검사를 생략할수 있다
      - java.util패키지의 컬렉션클래스 들은 기본적으로 제네릭스를 지원한다
      - 매개변수 타입에는 primitive타입을 사용할수 없다.

**Collection Type**
1. Set인터페이스   
   1. HashSet
      - Set에 객체를 저장하는데 Hash를 사용하여 처리속도가 빠르다
   2. LinkedHashSet
      - HashSet과 거의 같다.차이점은 Set에 추가되는 순서를 유지한다는것
   3. TreeSet
      - 객체의 Hash값에 의한 오름차순의 정렬을 유지한다

2. List인터페이스 
*List인터페이스로 구현된 클래스로 ArrayList, Vector, Stack, LinkedList가 있다*
   1. List
      - List의 요소에는 순서를 가진다
   2. ArrayList
      - 자바에서는 배열을 생성할때 배열의길이를 늘리거나 줄일수없다.
      - ArrayList클래스는 원소가 가득차게되면 자동적으로 저장영역을 늘려준다 
      - List에서 객체를 얻어내는데 효율적이다
      - 동기화(synchroniztion)을 제공하지 않는다
   3. LinkedList
      - List에서 앞뒤에 데이터를 삽입하거나 삭제하는데 효율적이다
      - 동기화를 제공하지 않는다
   4. Vector
      - 가변배열을 처리하는 클래스   
      - 배열(Array)은 고정길이를 사용하기 때문에 길이를 늘리거나 줄일수 없다. Vector클래스를 사용하면 배열의 크기를 늘리거나 줄일수 있다.
      - 기본적으로 ArrayList와 동등하지만 Vector에서는 동기화를 제공한다
      - 그래서 List객체중에 가장 성능이 좋지 않다
      - ```Vector<자료형> 객체명  = new Vector<자료형>(첨자_초기값,첨자_늘릴갯수);```

        ```java
        Vector<String> ss=new Vector<>(3,2);
        ```
        
        |function|description|
        |-|-|
        |```hasMoreElements()```|백터안에서 꺼낼 객체가 있으면 true, 없으면 false|
        |```nextElement()```|백터에서 객체를 가져옴|
        |```elements()```|백터요소들에 대한  numeration객체를 반환|
        |```capacity()```|현재 용량|
        |```size()```|현재data의 갯수|
        |```addElement()```|data추가|
        |```indexOf()```|찾는위치|
        |```contains()```|비교|
        |```remove()```|삭제|
        |```trimToSize()```|빈공간제거|

3. Map 인터페이스
   1. HashMap
       - 해쉬테이블처럼(키와 객체)쌍으로 저장 관리할수 있다.
       - Map에 키를 저장하는데 hash를 사용하여 성능이 좋다
       - 저장되는 순서를 유지하지 않는다
       - 오직 하나의 null키를 가질수 있다
       - key의 중복을 허용하지 않는다
   2. LinkedHashMap
       - HashMap과 거의 같다.차이점은 Map에 추가되는 순서를 유지한다는것
   3. HashTable
       - 자료를 테이블 구조로 쉽게 저장할수 있고, 검색할수 있는 클래스이다
       - Hashtable클래스는 Vector클래스에서 사용한 Enumeration인터페이스를 
         사용해 값을 가져올수 있다
       - 동기화를 제공한다. null키와 null값을 저장할수 없다
4. Iterator(반복자)인터페이스
    리스트는 원소를 순차적으로 접근하기 위해서 for문을 이용하지만, 반복자를 이용하여 원소에 접근할수 있다. 
    모여있는 자료들을 검색하여 처리하는 패턴

5. Enumeration인터페이스
    Collection인터페이스로 부터 구현한 클래스안에 저장된 객체를 꺼낼수 있다
    - ```hasMoreElements()``` : 요소가 있으면 true반환
    - ```nextElement()``` : 요소를 얻어낸다
  
6. AutoBox/AutoUnBoxing
> Primitive type과 Wrapper Class타입간 형변환을 자동화
> Collection에 primitive 타입을 넣고 빼는 경우에 유용함

---

### Java DataBase Connectivity
> JDBC, 데이터 베이스와 연동

1. Database 별 Driver 와 connection URL
<table style="text-align: center; vertical-align: middle;">
    <tr>
        <th colspan=2> Database 
        <th> value
    </tr>
    <tr>
        <th rowspan=2> Oracle
        <th> Driver 
        <td> oracle.jdbc.driver.OracleDriver 
    </tr>
    <tr>
        <th> URL
        <td> jdbc:oracle:thin:@hostname:port:SID <br> jdbc:oracle:thin:@127.0.0.1:1521:XE <br> jdbc:oracle:thin:@localhost:1521:ORCL
    </tr>
    <tr>
        <th rowspan=2> MSSQL
        <th> Driver 
        <td> com.microsoft.jdbc.sqlserver.SQLServerDriver
    </tr>
    <tr>
        <th> URL
        <td> jdbc:Microsoft:sqlserver://localhost:1433;databasename=DB명 
    </tr>
     <tr>
        <th rowspan=2> MYSQL
        <th> Driver 
        <td> org.gjt.mm.mysql.Driver <br> com.mysql.jdbc.Driver
    </tr>
    <tr>
        <th> URL
        <td> jdbc:mysql://localhost:3306/DB명 
    </tr>
</table>

2. 프로그램에서 DB 연결
   -  1 단계: JDBC드라이버 로드 
      -  ```Class.forName("드라이버종류")```
      - 드라이버 종류
        |드라이버 이름|사용|
        |-|-|
        |Access드라이버(ODBC)|```Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");```|
        |MySQL 드라이버|```Class.forName("com.mysql.jdbc.Driver");```|
        |오라클 드라이버|```Class.forName("oracle.jdbc.driver.OracleDriver");```|
        |MS-SQL 드라이버|```Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver ");```|
   - 2 단계: 데이터베이스 연결객체 생성
     - ```Connection con = DriverManager.getConnection(url, uid, pwd);```
     - url : JDBC형식의 url
     - uid : 사용자명
     - pwd : 패스워드
       1. Access인경우 : ```jdbc:odbc:ODBC명```
       2. 오라클인경우 : ```jdbc:oracle://localhost:1521:SID```
       3. MySQL인경우  : ```jdbc:mysql://localhost:3306/DB명```
       4. MS-SQL인경우 : ```jdbc:Microsoft:sqlserver://localhost:1433;databasename=DB명```

     - ```Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "edu","1234");```
   - 3 단계: SQL문 실행
     1. Statement객체를 이용하는 방법
        ```java
        Statement stmt=null;
        stmt = conn.createStatement();           // Connection객체와 연결
        String sql="insert into test(name,phone,addr) values +"('"+name+"','"+phone+"','"+addr+"')";   
        int n=stmt.executeUpdate(sql);            // 쿼리문전송
        ```
     2. PreparedStatement객체를 이용하는 방법
        ```java
        PreparedStatement pstmt=null;
        String sql="insert into test(name,phone,addr) values(?,?,?)";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, phone);
        pstmt.setString(3, addr);
        int n=pstmt.executeUpdate();
        ```
      - ``` executeUpdate():int```: insert, update, delete, create문
      - ```executeQuery():ResultSet```: select문
      - ```int executeUpdate()```
        int : 처리된 결과 개수 (입력 or 수정된 개수 …)
      - ```ResultSet exeucteQuery()```
ResultSet : select문의 결과 집합 (테이블)
Cursor의 위치를 이동(next())해 가며 결과를 가져옴(getXxxx())
      - ex)
      ```java
      String query = “select name,age from user”;
      ResultSet rs = stmt.executeQuery(qeury);
      while( rs.next() ) 
      {
      	String s = rs.getString(“name”);
      	float n = rs.getInt(“age”);
      	System.out.println(s + “ “ + n);
      } 
      ```

   - 4 단계:  결과처리
        ```JAVA
        String str = "select name,age from member";
        ResultSet rs = stmt.executeQuery(str);
        ```
   - 5 단계: 데이터 베이스와 연결해제
        ```JAVA
        rs.close();      //ResultSet해제
        stmt.close();   //Statement해제
        con.close();    //Connection해제
        ```

--- 

### AWT
> *Abstract Windows ToolKit*
> GUI (*Graphic User Interface*) 환경의 프로그램을 작성하기 위한 패키지

1. 컴포넌트 :사용자 인터페이스를 구성하는 기본요소
   - 버튼, 체크박스, 레이블, 텍스트필드, 리스트, 팝업메뉴와 같은 부속품의 총칭
   - 자바에서는 component라는 클래스가 있는데 모든 컴포넌트들은 이 Component 클래스의 자손이다.
2. 컨테이너 : 컨테이너는 컴포넌트들이 붙어 있는 윈도우 같은 것
   - 윈도우, 프레임, 패널, 다이얼로그 박스 등이 있다. (다른 컴포넌트를 담을수 있는 컨테이너)
3. 레이아웃 : 컨테이너에 컴포넌트를 붙일때 어떤 식으로 배치하는가가 중요한데 이것을 레이아웃이라 한다
4. 이벤트 : 사용자로부터 입력이 일어나는 것

- 컴포넌트 순서
  1. 컴포넌트 생성 (버튼 모양 만들기)
  2. 컨테이너 부착
  3. 이벤트 처리

<br>

1. AWT 클래스 구조
<table> 
    <tr>
        <td rowspan=12> Object
        <td rowspan=7> Component
        <td> Button
    </tr>
    <tr>
        <td> Label
    </tr>
     <tr>
        <td> List
    </tr>
     <tr>
        <td> Choice
    </tr>
     <tr>
        <td> Checkbox
    </tr>
     <tr>
        <td> Scrollbar
    </tr> 
    <tr>
        <td> Canvas
    </tr>
    <tr>
        <td rowspan=2> TextComponent
        <td> TextField
    </tr>
    <tr>
        <td> TextArea
    </tr>
    <tr>
        <td rowspan=3> Container
        <td> Panel
        <td> Applet
    </tr>
    <tr>
        <td> Window
        <td> Frame
    </tr>
    <tr>
        <td> Dialog
        <td> FileDialog
    </tr>
</table>

```java
import java.awt.*;
```
2. Panel (패널) : 컨테이너에 담을 수 있다.
3. Layout
   1. 레이아웃 매니저 : 컴포넌트를 적절한 위치에 배치할 수 있도록 하기 위해 레이아웃 매니저를 제공.
   2. 레이아웃 매니저의 종류 : FlowLayout, GridLayout, BorderLayout, CardLayout, GridBagLayout,null

    |layout|description|
    |-|-|
    |FlowLayout|왼쪽에서 오른쪽으로,위에서 아래로 순서대로 배치하는 단순한 레이아웃|
    |GridLayout|가로,세로 비율을 나누어 공간(셀)에 배치(모눈종이와같은모양)|
    |BorderLayout|동, 서, 남, 북, 중앙으로 화면을 분할|
    |CardLayout|여러개의 카드를 쌓아둔것처럼 보여주는 배치관리자|
    |GridBagLayout|가장복잡한 레이아웃|
    |null|레이아웃 매니저를 이용하지 않고 좌표를 지정하여 붙인 예제|
   3. 레이아웃 매니저를 사용하는 법
       ```java
        setLayout(new FlowLayout());   //Container 클래스의 메소드 
       ```
   4. 각 레이아웃의 기본.
      - FlowLayout - Panel이나 Applet의 기본 레이아웃.
      - BorderLayout - Frame과 Dialog의 기본 레이아웃.
4. 이벤트 : 마우스나 키보드등을 이용해서 사용자로부터 입력이 일어나는것
   1. 이벤트소스 - 이벤트를 발생시킨 윈인이 되는 컴포넌트
   2. 이벤트클래스
   3. 이벤트핸들러 - 해당하는 이벤트가 실행되었을때 실행될루틴
   <br>
   * 발생시키는 이벤트

    |컴포넌트|발생시키는 이벤트 클래스|
    |-|-|
    |```Button```|```ActionEvent```|
    |```Checkbox```|```ItemEvent```|
    |```CheckboxMenuItem```|ItemEvent|
    |```Choice```|```ItemEvent```|
    |```Component```|```ComponentEvent```, ```FocusEvent```, ```KeyEvent```, ```MouseEvent```|
    |```Container```|```ContainerEvent```|
    |```List```|```ActionEvent```, ```ItemEvent```|
    |```MenuItem```|```ActionEvent```|
    |```Scrollbar```|```AdjustmentEvent```|
    |```ScrollPane```|```AdjustmentEvent```|
    |```TextComponent```|```TextEvent```|
    |```TextField```|```ActionEvent```|
    |```Window```|```WindowEvent```|
   * 이벤트 리스터

    |이벤트 클래스|리스너 인터페이스|리스너 메소드|
    |---------|-------------|----------|
    |```ActionEvent```|```ActionListener```|```actionPerformed(ActionEvent e)```|
    |```AdjustmentEvent```|```AdjustmentListener```|```adjustmentValueChangeed(AdjustmentEvent e)```|
    |```ComponentEvent```|```ComponentListener```|```componentHidden(ComponentEvent e)```<br>```componentMoved(ComponentEvent e)```<br>```componentResized(ComponentEvent e)```<br>```componentShown(ComponentEvent e)```|
    |```FocusEvent```|```FocusListener```|```focusGained(FocusEvent e)```<br>```focusLost(FocusEvent e)```|
    |```ItemEvent```|```ItemListener```|```itemStateChanged(ItemEvent e)```|
    |```KeyEvent```|```keyListener```|```keyPressed(KeyEvent e)```<br>```keyReleased(KeyEvent e)```<br>```keyTyped(KeyEvent e)```|
    |```MouseEvent```|```MouseListener```|```mouseClicked(MouseEvent e)```<br>```mouseEntered(MouseEvent e)```<br>```mousePressed(MouseEvent e)```|
    ||```MouseMotionListener```|```mouseReleased(MouseEvent e)```<br>```mouseDragged(MouseEvent e)```<br>```mouseMoved(MouseEvent e)```|
    |```TextEvent```|```TextListener```|```textValueChanged(TextEvent e)```|
    |```WindowEvent```|```WindowListener```|```windowActivated(WindowEvent e)  //윈도우활성```<br>```windowClosed(WindowEvent e) //윈도우최소```<br>```windowClosing(WindowEvent e)    //윈도우종료```<br>```windowDeactived(WindowEvent e)  //윈도우비활성```<br>```windowIconified(WindowEvent e)  //윈도우아이콘화 ```<br>```windowDeiconified(WindowEvent e)//윈도우아이콘해제```<br>``` windowOpened(WindowEvent e)     //윈도우열기```

    * 이벤트클래스 설명

    |이벤트 클래스| 설 명|
    |-|-|
    |```ActionEvent```|버튼이 눌러졌거나 텍스트필드의 입력이 완료되었을때,<br>메뉴의 항목이 선택되었을 때,<br>  리스트의 항목이 더블클릭 되었을때 발생.|
    |```AdjustmentEvent```|스크롤바의 버블이 움직일때 발생.|
    |```ComponentEvent```|컴포넌트의 위치나 크기가 변경되었을 때, <br>또는 컴포넌트가 나타나거나 숨겨질 때 발생|
    |```ContainerEvent```|컴포넌트가 컨테이너에 추가되거나 삭제되었을때 발생|
    |```FocusEvent```|컴포넌트가 키보드로부터 입력을 받아들이기 위한 포커스를 획득하거나 잃었을때 발생.|
    |```ItemEvent```|체크박스나 초이스,<br>리스트의 항목이 선택(한번클릭) 되었을 때 발생|
    |```KeyEvent```|키보드로부터 입력이 있을때 발생|
    |```MouseEvent```|사용자가 마우스 버튼을 누르거나 놓을때,<br>마우스가 컴포넌트 위로 들어가거나 나올 때,<br>또는 사용자가 마우스를 이동하거나 드래그 할때 발생|
    |```TextEvent```|입력된 텍스트에 변경이 일어날때 발생|
    |```WindowEvent```|윈도우가 열리거나 닫힐 때, 최소화하거나 최대화 할때,<br>윈도우 메뉴가 선택될 때 발생|

---

### IO

> Java I/O (input output)

1. 입/출력의 정의
   - *외부에서 프로그램으로 들어오는 일을 입력이라고 하고 반대로 프로그램에서 나가는 일을 출력이라고 한다.
   입출력 장치*
     - 파일, 디스크
     - 키보드, 모니터, 마우스
     - 메모리
     - 네트워크

2. Stream(스트림)의 이해 
   1. 자료의 입출력을 도와주는 중간 매개체로써 스트림은 데이터를 읽고 쓰기위한 공통된 방법을 제공한다.
   2. 노드스트림(=바이트스트림): 데이터 저수지에 직접연결되어 있는 부분으로 대표적인 입력노드스트림은 *InputStream*. 출력스트림은 *OutputStream*
   3. 필터스트림(=문자스트림): 예로 노드스트림을 통해 한글데이터를 직접가져올 경우 모두 깨져버리는데 깨지지 않도록 필터스트림을 주는데 대표적인 입력 필터 스트림은 *Reader*, 출력 필터 스트림은 *Writer가* 있다. (ex. InputStreamReader,  OuputStreamWriter) <br>
   또다른 예로, 프로그램을 읽을때마다 노드스트림을 통해서 파일 등에 접근하기 때문에, 당연히 기다려야 하는 문제가 생길수밖에 없는데 이럴때 사용하는 것이 *BufferedReader*등이 있다. 이들은 필터스트림의 생성자에 노드스트림의 객체를 주어서 사용한다.
   4. 스트림은 크게 두가지로 나눌 수있다. 
      1. 문자 스트림 : 문자 단위로 처리함
         - ```Reader``` : 입력용 문자 스트림
         - ```Writer``` :   출력용 문자 스트림
         - Reader나 Wrtier가 붙으면 문자스트림이라는 것을 알 수 있음

      2. 바이트 스트림 : 바이트 단위로 처리함
         - ```InputStream``` or ```OutputStream```

3. 각 노드스트림에 연결할 수 있는 필터스트림이 따로 있는데 다음과 같다.

