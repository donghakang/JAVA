## switch
```JAVA
public static void main (String[] args) {
    int num = 170;
    
    switch(num) {
    case 50:
        System.out.println("num은 50 입니다");
        break;
    case 40:
        System.out.println("num은 40 입니다");
        break;
    case 30:
        System.out.println("num은 30 입니다");
        break;
    case 20:
        System.out.println("num은 20 입니다");
        break;
    case 10:
        System.out.println("num은 10 입니다");
        break;
    case 5:
        System.out.println("num은 5 입니다");
        break;
    case 1:
        System.out.println("num은 1 입니다");
        break;
    default:
        System.out.println("num은 " + num + " 입니다");
    }
}
```

1. break를 안쓰면, 밑에 다 작동된다
2. default는 else 같은 역할을 한다.

