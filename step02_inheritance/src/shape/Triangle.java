package shape;

/*  Triangle는  Shape를 상속받음
* 
*  +Triangle()
*  +Triangle(data1:int , data2:int)
*  +getSize():double            ==>삼각형의 넓이를 리턴(밑변 * 높이 /2) 
*/
public class Triangle extends Shape {

	public Triangle() {
		super();
	}

	public Triangle(int data1, int data2) {
		super(data1, data2);
	}

	@Override
	public double getSize() {
		// TODO Auto-generated method stub
		return super.getSize() / 2.0;
	}
	
	
	
}
