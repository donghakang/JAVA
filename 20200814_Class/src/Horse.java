
public class Horse {
	
	int legs = 4;
	int speed;
	int weight; 
	
	
	Horse() {
		this(0, 0);
	}
	
	Horse(int speed, int weight) {
		this.speed = speed;
		this.weight = weight;
	}
	
	
	void run() {
		System.out.println("���� �޸���");
	}
	
	void sleep() {
		System.out.println("���� �ܴ�");
	}
}
