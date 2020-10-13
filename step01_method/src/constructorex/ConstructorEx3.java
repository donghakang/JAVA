package constructorex;

class UserInfo {
	public String name;
	public String addr;
	
	public UserInfo() {
		super();
		System.out.println("** 주소록  **");
	}
	
	public UserInfo(String name, String addr) {
//		super();
		this();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}


public class ConstructorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo ob = new UserInfo("도라에몽", "서울시 강남구 150");
		System.out.println("이름: " + ob.getName());
		System.out.println("주소: " + ob.getAddr());
	}

}
