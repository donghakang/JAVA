package objectex;

/*   
Ŭ������ : User
+name:String              
+k:int
+e:int
+m:int

+setUser(name:String, k:int, e:int, m:int):void
+getTotal():int
+getUser():String
*/
public class User {
	private String name;
	private int k;
	private int e;
	private int m;
	
	public void setUser(String name, int k, int e, int m) {
		
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	public String getUser() {
		return "���� �̸��� " + this.name + "�̰�, ������ " + this.getTotal() + "�� �Դϴ�.";
	}
	
	private int getTotal() {/* 
		 * get the total score
		 * 
		 * @return sum of three scores (k, e, m)
		 */
		return this.k + this.e + this.m;
	}

}
