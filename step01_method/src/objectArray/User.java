package objectArray;

public class User {
	private String name;
	private String phone;
	
	public User() {
		this.name = "°­µ¿ÇÏ";
		this.phone = "01029028330";
	}
	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
