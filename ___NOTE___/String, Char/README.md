# String, Char

**String**: 그냥 한개의 캐릭터가 아닌 것.
char 보다 더 많이 쓰임.

```JAVA
String str = "Hello World";
System.out.println(str + "!!!");                // Hello World!!!
```

## 교체
```JAVA
String newStr;

newStr = str.replace('s', 'b');         // bentence, char = argument.
newStr = str.replaceAll("en", "an");    // santance, string 전체를 다 바꿔줌.
newStr = str.replaceFirst("en", "an");  // santence, 첫번째 것을 바꿔줌.

// 만약에 정해진 위치에 있는 것을 바꾸고 싶을때.
newStr = str.substring(0,4) + "?" + str.substring(5);  // sent?nce
```

## substring
```JAVA
newStr = str.substring(6);                // ce, 6위치에서 끝까지
newStr = str.substring(0,4);              // sent, 0 - 4까지 (4 포함 X)

// 만약에 정해진 위치에 있는 것을 바꾸고 싶을때.
newStr = str.substring(0,4) + "?" + str.substring(5);  // sentence
```

## charAt
```JAVA
char   c = str.charAt(5);                   // n,     5번째 위치에 char
String s = Character.toString(c);
```

## indexOf
```JAVA
String str = "sentence";
int idx;
idx = str.indexOf("s");                         // 0
idx = str.indexOf("e");                         // 1
idx = str.lastIndexOf("e");                     // 7
idx = str.indexOf("dasdf");                     // -1
```

## 그 외 알면 좋은 것들
```java
String level = "%%##123";
if (level.startsWith("%%")) {                  // boolean, 시작하는것이 같으면 true
    ...
}


String[] temp = level.split("1");              // split
temp[0];     // %%##
temp[1];     // 23
```


