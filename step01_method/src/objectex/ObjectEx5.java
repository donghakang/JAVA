package objectex;
/*   Ŭ������ : Sales
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
 *   +toString():String         ==> ���
 *   +getPrice():int            ==> ���� * �ܰ��� ����
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
		return this.item + "���� " + this.cost + "�� ¥�� " + this.qty + "�� �����Ϸ��� " + this.getPrice() + "���� �ʿ���";
	}
	
	public int getPrice() {
		return this.qty * this.cost;
	}
	

}
public class ObjectEx5 {
	public static void main(String[] args) {
		//Sales ��ü ob�� ���� setter�� ���� �����͸� �����ÿ�
		Sales ob = new Sales();
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		
		
		System.out.println(ob.toString());
		System.out.println();
		System.out.println("ǰ��: " + ob.getItem());
		System.out.println("����: " + ob.getQty());
		System.out.println("�ܰ�: " + ob.getCost() + "��");
		System.out.println("�ݾ�: " + ob.getPrice() + "��");
		
		//[����1] toString()���� ����Ͻÿ�
		
		
		//[����2]getter�� �̿��ؼ� ����Ͻÿ�
		

	}
} 
/*  
*[����1]
*ǰ�� : apple
*���� : 5
*�ܰ� : 1200��
*�ݾ� : 6000��
*
*[����2]
*apple����  1200�� ¥�� 5�� �����ϸ� 6000���� �ʿ���
*/


