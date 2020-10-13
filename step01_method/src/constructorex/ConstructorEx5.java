package constructorex;

import java.util.Scanner;

/*
[문제] 생성자에서 두수를 입력받아 큰수와 작은수를 출력하시오
show()메서드에서 maxValue(), minValue()를 호출할것

클래스명 : Max
-a:int
-b:int
+Max()           <--입력받기
+maxValue():int  <--큰값 리턴(삼항연산자 이용)
+minValue():int  <--작은값 리턴
+show():void     <--출력

[출력]
Input a: 5
Input b: 3

큰수 : 5
작은수: 3
 */
 
class Max {
	public int a;
	public int b;
	
	public Max() {
		Scanner scan = new Scanner(System.in);
		System.out.print("a: ");  this.a = scan.nextInt();
		System.out.print("b: ");  this.b = scan.nextInt();
	}
	
	public int maxValue() {
		return (this.a > this.b) ? this.a : this.b;
	}
	
	public int minValue() {
		return (this.a < this.b) ? this.a : this.b;
	}
	
	public void show() {
		System.out.println("Input a: " + this.a);
		System.out.println("Input b: " + this.b);
		System.out.println("\n큰수 : " + this.maxValue());
		System.out.println("작은수: " + this.minValue());
	}
}


public class ConstructorEx5 {

	public static void main(String[] args) {
		Max ob = new Max();
		ob.show();
	}

}
