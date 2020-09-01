import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	ArrayList<Room> map = new ArrayList<Room>();
	public void start() {
		Random rd = new Random();
		for (int i = 0; i < 50; i++) {
		
			
			int ranNum = rd.nextInt(5);
			int eventType = 0;
			int value = 0;
			
			if (ranNum == 0 ) {
				ranNum = rd.nextInt(3);
				if (ranNum == 0) {
					eventType = 1;
					value = rd.nextInt(5) + 1;
				} else if (ranNum == 1) {
					eventType = 1;
					value = (rd.nextInt(5) + 1) * -1;
				} else if (ranNum == 2) {
					eventType = 2;
				}
			}
			
			map.add(new Room(eventType, value));
		}
		
		Scanner scan = new Scanner(System.in);
		int move;
		Player p = new Player();
		while (true) {
			System.out.println("주사위를 던지려면 엔터를 누르시오");
			scan.nextLine();
			
			move = rd.nextInt(6) + 1;
			p.position += move;
			
			if (p.position > map.size() - 1) {
				
			}
			
			
			if (map.get(p.position).eventType == 1) {
				System.out.println(map.get(p.position).value + "만큼 이동합니다");
				p.position += map.get(p.position).value;
			} else if (map.get(p.position).eventType == 2) {
				System.out.println("출발지로 이동합니다");
				p.position = 0;
			}
		}
	}
}
