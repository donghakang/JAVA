package homework;
/*
 * [문제5]다음을 수정/완성하시오
(1)클래스명:Test5
     필드명 : -base:double  (초기값:5.0)
                -height:double (초기값:3.5)
     메서드명: +getArea():double
                  +getHypotenuse():double 
                  +getPerimeter():double
(2)조건
   1)공  식 : 삼각형의 넓이 = (밑변 * 높이) /2
                빗변길이 = Math.sqrt(밑변*밑변+높이*높이)  
                둘레길이 = 밑변 + 높이 + 빗변길이 
   2) Test5로 객체 ob를 생성한다
   3) getArea()는 삼각형의 넓이를 리턴한다
       getHypotenuse() 빗변의 길이를 리턴한다
       getPerimeter()는 둘레길이를 리턴한다 

[출력화면]
삼각형의넓이 : 8.75
빗변길이 : 6.10
둘레길이 : 14.60
 */

class Test5{
	public double base;
	public double height;

	public Test5() {
		this.base = 5.0;
		this.height = 3.5;
	}

	public Test5(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getArea() {
		return this.base * this.height / 2.0;
	}
	
	public double getHypotenuse() {
		return Math.sqrt((this.base * this.base) + (this.height * this.height));
	}
	
	public double getPerimeter() {
		return this.base + this.height + this.getHypotenuse();
	}
}
public class problem5 {
	public static void main(String[] args) {
		Test5 ob = new Test5();
		System.out.printf("삼각형의넓이: %.2f\n", ob.getArea());
		System.out.printf("빗변길이: %.2f\n", ob.getHypotenuse());
		System.out.printf("둘레길이: %.2f\n", ob.getPerimeter());
	}
}
