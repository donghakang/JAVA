package objectex;

//나의 이름은 강호동이고 총점은 231점 입니다.





public class ObjectEx2 {
	public static void main(String[] args) {
		User uu=new User();
		uu.setUser("강호동", 97, 55, 79);
		System.out.println(uu.getUser());
	}
}
