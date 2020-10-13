package homework;

public class homework2 {

	public static String output(int num, char c) {
		String s = "";
		for (int i = 0; i < num; i ++) {
			s += c + " ";
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(output(10, '#'));
	}
}
