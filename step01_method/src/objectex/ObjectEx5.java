package objectex;
/*   클래스명 : Sales
 *   -item:String
 *   -qty:int
 *   -cost:int
 *   
 *   +setItem(item String):void 
 *   +setQty(qty int):void
 *   +setCost(cost int):void
 *   +getItem():String
 *   +getQty():int
 *   +getCost():int
 *   
 *   +toString():String         ==> 출력
 *   +getPrice():int            ==> 수량 * 단가를 리턴
 */
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	
	
//	public Sales(String item, int qty, int cost) {
//		this.item = item;
//		this.qty = qty;
//		this.cost = cost;
//	}
//	
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString () {
		return this.item + "가격 " + this.cost + "원 짜리 " + this.qty + "개 구입하려면 " + this.getPrice() + "원이 필요함";
	}
	
	public int getPrice() {
		return this.qty * this.cost;
	}
	

}
public class ObjectEx5 {
	public static void main(String[] args) {
		//Sales 객체 ob를 만들어서 setter를 통해 데이터를 넣으시오
		Sales ob = new Sales();
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		
		
		System.out.println(ob.toString());
		System.out.println();
		System.out.println("품목: " + ob.getItem());
		System.out.println("수량: " + ob.getQty());
		System.out.println("단가: " + ob.getCost() + "원");
		System.out.println("금액: " + ob.getPrice() + "원");
		
		//[문제1] toString()으로 출력하시오
		
		
		//[문제2]getter를 이용해서 출력하시오
		

	}
} 
/*  
*[문제1]
*품목 : apple
*수량 : 5
*단가 : 1200원
*금액 : 6000원
*
*[문제2]
*apple가격  1200원 짜리 5개 구입하면 6000원이 필요함
*/


