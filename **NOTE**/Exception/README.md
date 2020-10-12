# Exception

```java
try {
    <에러가 없을때 실행되는 코드>
} catch (<Exception 에러 이름> e) {
    <에러가 뜰때 대신 실행되는 코드>
} catch (Exception e) {
    <위에 언급된 에러 말고 실행되는 코드>
}
```

제일 많이 사용된 에러
* ```NullPointerException``` : null이 사용될 때,
* ```NumberFormatException``` : String -> Integer가 불가능할때
* ```ArrayIndexOutOfBoundsException``` : Array 사이즈가 틀릴때


```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("숫자를 입력하시오: ");
    String input = scan.nextLine();

    try {
        int num = Integer.parseInt(input);
        num *= 2;
        System.out.println(num);

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 3;

    } catch (NumberFormatException e) {
        System.out.println("LMSG: " + e.getLocalizedMessage());
        System.out.println("MSG : " + e.getMessage());
        System.out.println("trac: " + e.getStackTrace());
        System.out.println("숫자를 넣으라니깐");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("배열 오류");
    } catch(Exception e) {
        System.out.println("모든 오류");
    }                                             // 모든 오류를 없앤다. 각기 다른 에러 핸들링이 필요없을때
    System.out.println("프로그램 종료");
}
```

#### Error 메시지

* ```e.getLocalizedMessage()```: 로컬 언어로 메시지를 출력
* ```e.getMessage()```: default 언어로 메시지를 출력
* ```e.getStackTrace()```: Stack trace 메시지를 어레이로 출력
