
public class Bus {
	int wheels = 4;
	int speed;
	int people;
	int capacity = 20;

	Bus() {
		this(0, 0, 20);
	}
	
	Bus(int speed, int people, int capacity) {
		this.speed = speed;
		this.people = people;
		this.capacity = capacity;
		
	}

	
	void enter(int newPeople) {
		this.capacity -= newPeople;
	}
}
