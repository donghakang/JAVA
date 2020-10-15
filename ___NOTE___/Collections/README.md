# Collections 컬렉션

## Set
- 중복 X
- 추가되는 순서 유지 X 
```java
public static void main(String[] args) {
    Set set = new HashSet();
    set.add("one");
    set.add(2);						// init(primitive type)
    set.add(new Float(3.0f));
    set.add(new Integer(2));
    set.add(4.0f);
    set.add(new Double(4.00));
    set.add(new String("one"));
    System.out.println(set);
    
    /*
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
        System.out.println(iter.next());
    }
    */

    for (Object o : set) {
        System.out.println(o);
    }
}
```

---

## List / ArrayList

```java
- 중복 O
- 추가 순서 유지 O
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    
    list.add("a");
    list.add("b");
    list.add("c");
    
    for (String e : list) {
        System.out.println(e);
    }
}
```

#### List Sort
```java
// collections 을 사용한다
ArrayList<Integer> intArr = new ArrayList<>();
...

Collections.sort(intArr);           // 오름차순
Collections.sort(intArr, new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);    // 내림차순
    }
});

// String 도 가능

```

---

## Map
-  키와 값의 쌍으로 저장된다
-  단, 키와 값이 모두 객체이어야 한다
```java
public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("ddd","둘리");
    map.put("bbb","도우넛");
    map.put("aaa","또치");
    map.put("ccc","마이콜");
    System.out.println(map);
    
    for(String v: keyList) {
        System.out.println(v + "\t" + map.get(v));
    }
}
```

#### Map to Set to List
```java
public static void main(String[] args) {
    // set up HashMap
    Map<String,String> map=new HashMap<>();
    map.put("ddd","둘리");
    map.put("bbb","도우넛");
    map.put("aaa","또치");
    map.put("ccc","마이콜");
    System.out.println(map);          // {aaa=또치, ccc=마이콜, bbb=도우넛, ddd=둘리}

    Set<String> keySet=map.keySet();
    System.out.println(keySet);       // [aaa, ccc, bbb, ddd]

    ArrayList<String> keyList = new ArrayList<>(keys);
    System.out.println(keyList);      // [aaa, ccc, bbb, ddd]

    Collections.sort(keyList);
    System.out.println(keyList);      // [aaa, bbb, ccc, ddd]
```

#### Sort map
```java
public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("고길동","객실1");
    map.put("둘리","객실2");
    map.put("또치","객실1");
    map.put("마이콜","객실3");
    map.put("도우넛","객실4");
    map.put("희동이","객실2");
```

**sort**
```java
    List<String> list = new ArrayList<>(map.keySet());

    Collections.sort(list, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return map.get(o1).compareTo(map.get(o2));
        }
    });

```

```java
    //[문제1]전체 객실 사용자 출력(forEach를 사용)
   
    ArrayList<String> rooms = new ArrayList<>();
    for (String user: list) {
        rooms.add(map.get(user));
        System.out.println(map.get(user) + "에 있는 사용자는 " + user + "입니다.");
    }
            
    //객실1에 있는 사용자는 고길동입니다
    //객실1에 있는 사용자는 또치입니다
    //객실2에 있는 사용자는 둘리입니다
    //           :
    

    //[문제2]객실별 사용자 출력(Iterator를 사용)
    //방 이름을 입력하시오(객실1~객실4):객실1
    //객실1에 있는 사용자는 고길동입니다
    //객실1에 있는 사용자는 또치입니다
    Scanner sc=new Scanner(System.in);
    System.out.print("방 이름을 입력하시오(객실1~객실4):");
    String room=sc.next();
    
    Iterator iter = map.keySet().iterator();
    while (iter.hasNext()) {
        String user = (String)iter.next();
        String currRoom = map.get(user);
        if (currRoom.equals(room)) {
            System.out.println(currRoom + "에 있는 사용자는 " + user + "입니다.");
        }
    }

    
    sc.close();
}
```


--- 
### More examples
```java
class Book {
    /*
    * @param <String> : -title
    * @param <String> : -author
    * @param <int> : -price
    *
    * +Book()
    * +Book(title: String, name: String, price: int)
    *
    * +getTitle()  -> String
    * +getAuthor() -> String
    * +getPrice()  -> int
    * +setTitle(title: String)
    * +setAuthor(author: String)
    * +setPrice(price: int)
    * +toString()
    */
}

public class MapEx4 {
    public static void main(String[] args) {
        Book ob1=new Book("java","kim",100);
        Book ob2=new Book("oracle","lee",250);
        Book ob3=new Book("c++","park",150);
                
        //hash map추가------------------------
        Map<String,Book> map=new HashMap<>();
        map.put(ob1.getTitle(), ob1);
        map.put(ob2.getTitle(), ob2);
        map.put(ob3.getTitle(), ob3);
            
        //[문제1]이름만 출력----------------------
        /*
        @return - park
                kim
                lee
        */
        Set<String> titleSet = map.keySet();
            
        for (String title: titleSet) {
            Book temp = map.get(title);
            System.out.println("이름: " + temp.getAuthor());
        }
        
        //[문제2]검색-----------------------------

        /*
        @return - 찾는 도서명: c++
                책이름:c++  저자:lee  페이지:250
        
                찾는 도서명: php
                찾는 도서가 없습니다
        */

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("찾는 도서명: ");   String t=sc.next();
            if (t.equals("exit")) {
                break;
            }
            if (map.get(t) == null) {
                System.out.println("찾는 도서가 없습니다.");
            } else {
                System.out.println(map.get(t));
            } 
        }

        sc.close();
    }
}

```

---

### Additional Note


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