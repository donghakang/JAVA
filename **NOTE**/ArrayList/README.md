# 동적 배열 (ArrayList)

**뜻**: 크기가 명확이 정해지지 않은 배열.
**장점**:
1. 길이 제한 X
2. 데이터를 쉽게 삽입, 제거 가능

​

​

## ArrayList 부르기

```JAVA
import java.util.ArrayList;         // ArrayList 부르기
```
​

## ArrayList 값 주기
``` JAVA
ArrayList<String> strArr   = new ArrayList<>();
ArrayList<Integer> intArr  = new ArrayList<>();
ArrayList<Boolean> boolArr = new ArrayList<>();
ArrayList<Float> floatArr  = new ArrayList<>();
```

## 삽입
```JAVA
ArrayList<String> strArr   = new ArrayList<>();

strArr.add("가"); 
```

## 출력
```JAVA
String s;
s = strArr.get(0);         // 0 번째 위치 가져오기
```

## 교체
```JAVA
strArr.set(0,  "고");                // 0번째 위치를 "고"로 바꾼다
```
## 제거
```JAVA
strArr.remove(3);                    // 3번째 위치에 있는 것을 바꾼다
```

## 위치 파악
```JAVA
int idx; 

idx = strArr.indexOf("가");			    // 첫번째      "마"의 위치
idx = strArr.lastIndexOf("가");			// 맨끝에 있는 "마"의 위치
```
## 배열의 길이 확인
```JAVA
idx = strArr.size();
```

## 배열 삭제
```JAVA
strArr.clear();
```

---

### 동적 배열을 사용한 Dictionary 예시
```JAVA
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dictionary = new ArrayList<>();              // 단어
        ArrayList<String> description = new ArrayList<>();             // 뜻

        Scanner scan = new Scanner(System.in);
        String input;
        String vocab, meaning;

        while (true) {
            System.out.println("원하는 사항을 고르시오 ");
            System.out.println("1. 단어 추가");
            System.out.println("2. 단어 삭제");
            System.out.println("3. 단어 수정");
            System.out.println("4. 오늘의 단어");
            System.out.println("5. 단어 게임");
            System.out.println("6. 종료");
            System.out.print("    +------------: ");
            input = scan.nextLine();

            if (input.equals("1") || input.equals("단어 추가")) {
                System.out.print("단어: ");
                vocab = scan.nextLine();
                System.out.print("뜻  : ");
                meaning = scan.nextLine();

                dictionary.add(vocab);                    // 단어 추가
                description.add(meaning);                 // 뜻 추가

                System.out.println("추가 되었습니다. ");

            } else if (input.equals("2") || input.equals("단어 삭제")) {
                System.out.print("어떤 단어를 삭제할까요?: ");
                vocab = scan.nextLine();

                int pos = dictionary.indexOf(vocab);                  // 단어 위치 파악
                dictionary.remove(pos);                               // 단어 제거
                description.remove(pos);                              // 뜻 제거

                System.out.println("삭제 되었습니다. ");

            } else if (input.equals("3") || input.equals("단어 수정")) {
                System.out.print("어떤 단어를 수정할까요?: ");
                vocab = scan.nextLine();

                int pos = dictionary.indexOf(vocab);

                System.out.print("수정할 단어를 입력하세요: ");
                vocab = scan.nextLine();
                System.out.print("수정할 뜻을 입력하세요  : ");
                meaning = scan.nextLine();

                dictionary.set(pos, vocab);                          // 단어 수정
                description.set(pos, meaning);                       // 뜻 수정

                System.out.println("수정 되었습니다. ");


            } else if (input.equals("4") || input.equals("오늘의 단어")) {
                int pos = new Random().nextInt(dictionary.size());

                System.out.println("오늘의 단어: " + dictionary.get(pos));
                System.out.println("      뜻: " + description.get(pos));

            } else if (input.equals("5") || input.equals("단어 게임")) {
                System.out.println("Coming soon .... ");
            } else if (input.equals("6") || input.equals("종료")) {
                break;
            } else {
                continue;
            }
        }
    }
}
```

