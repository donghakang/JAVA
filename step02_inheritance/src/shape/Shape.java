package shape;

public class Shape {
	int data1;
	int data2;

	
	public Shape() {
		super();
	}

	public Shape(int data1, int data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public int getData2() {
		return data2;
	}

	public void setData2(int data2) {
		this.data2 = data2;
	}
	
	public double getSize() {
		return data1 * data2;
	}
	
}
