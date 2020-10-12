# Random, Scanner, Array

## Random
``` JAVA
import java.util.Random;

...

Random rand  = new Random();
randomNumber = rand.nextInt(10);             // 0 - 9 임의의 숫자

int random   = new Random().nextInt(10);     // 0 - 9 임의의 숫자
```


## Scanner
```JAVA
import java.util.Scanner;

...

Scanner scan = new Scanner(System.in);
String input = scan.nextLine();                    // console에 누르는 값이 
                                                   // input이라는 string 으로 저장됨
```
## Array
사이즈가 몇 개인지 확실하게 알때는 ArrayList보다 더 좋을 수 있다.
```JAVA
int[] intArr = new int[10];
String[][] strDoubleArr = new String[10][10];          // 총 100개 삽입 가능.

int   len     = intArr.length;                         // 10
int[] intArr2 = intArr.clone();                        // 복사
```