package solution;

import java.util.Scanner;

/* [문제6] 지불된 금액에서 제품 가격 2340원을 뺀 차액을 동전으로 거스름돈을 주려고 한다.
 최소 동전의 개수로  거스름돈을 줄 수 있게 구현하시오.
 동전은 500, 100, 50, 10 원이 사용된다고 정한다.
 
 [결과 화면]
 금액을 지불해 주세요 : 3310
 상품의 가격 : 2340   
 거스름돈 660
 500 동전 : 1개
 100 동전 : 3개
 50 동전 : 1개
 10 동전 : 2개
  
 지불된 금액이 제품 가격 보다 적을 때 -> "제품을 구매할 수 없어요"
 지불된 금액과 제품 가격이 동일할 때 -> "거스름돈이 없습니다."
 지불된 금액이 제품 가격 보다 많을 때 -> "500원 X개, 100원 X개..."
 필요없는 금액의 동전은 출력하지 않는다. 
*/
public class ExamTest06{

    public static void changeDetail(int change) {
        if (change > 500) {
            // 500원이 있음
            System.out.println("500 동전 : \t " + (int)(change / 500) + "개");  
            change = change - ((int)(change / 500) * 500);
        } 
        if (change > 100) {
            // 100원이 있음
            System.out.println("100 동전 : \t " + (int)(change / 100) + "개");  
            change = change - ((int)(change / 100) * 100);
        }
        if (change > 50) {
            // 50원이 있음
            System.out.println("50 동전 : \t " + (int)(change / 50) + "개");  
            change = change - ((int)(change / 50) * 50);
        } 
        if ( change > 10) {
            // 10원 있음
            System.out.println("10 동전 : \t " + (int)(change / 10) + "개");  
            change = change - ((int)(change / 10) * 10);
        }
    }

	public static void main(String[] args) {
		int productPrice = 2340;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 지불해 주세요 : ");
		int money = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		int change=money-productPrice;
        
        if(change > 0){
			System.out.println("상품의 가격 : " + productPrice);
			System.out.println("거스름돈 : " + change);
		}else if(change==0){
			System.out.println("거스름 돈이 없습니다");
		}else{
			System.out.println("재품을 구매할수 없어요");
        }
        
        changeDetail(change);
	}
}





