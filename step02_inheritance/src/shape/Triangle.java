package shape;

/*  Triangle��  Shape�� ��ӹ���
* 
*  +Triangle()
*  +Triangle(data1:int , data2:int)
*  +getSize():double            ==>�ﰢ���� ���̸� ����(�غ� * ���� /2) 
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
