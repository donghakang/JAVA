
public class Tiger {
	int legs = 4;
	int speed;
	int weight; 
	
	Tiger() {
		this(0, 0);
	}
	
	Tiger(int speed, int weight) {
		this.speed = speed;
		this.weight = weight;
	}
	
	
	void gainWeight(int weight) {
		System.out.println("ȣ���̴� �����԰� " + this.weight + "���� " + (this.weight + weight) + "�� �Ǿ����ϴ�.");
	}
	
	void run() {
		System.out.println("ȣ���̰� �޸���");
	}
	
	void sleep() {
		System.out.println("ȣ���̰� �ܴ�");
	}

	void roar() {
		System.out.println("���������������ä��������ä����ä�");
	}
}
