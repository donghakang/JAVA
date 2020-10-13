package objectArray;

public class UserEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] ob = new User[] {new User("kim", "010-2902-8330"), 
								new User("lee", "010-1234-1234"),
								new User("kang", "010-1234-1234")};
		
		for (User m : ob) {
			System.out.println(m.getName() + "\t" + m.getPhone());
		}
	}

}
