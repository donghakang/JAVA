
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
		System.out.println("호랑이는 몸무게가 " + this.weight + "에서 " + (this.weight + weight) + "가 되었습니다.");
	}
	
	void run() {
		System.out.println("호랑이가 달린다");
	}
	
	void sleep() {
		System.out.println("호랑이가 잔다");
	}

	void roar() {
		System.out.println("으어어어어어어어어어ㅓ허ㅓㅎ허허어허ㅓㅇ허어ㅓㅇ");
	}
}
