package shape;

public class ShapeMain {
	public static void main(String[] args) {
		Rectangle ob1 = new Rectangle(4,5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ: " + ob1.getSize());
		
		Triangle ob2 = new Triangle(3,7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: " + ob2.getSize());
	}
}
