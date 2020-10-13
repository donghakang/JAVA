package animal;

import java.util.Scanner;


// dynamic binding = 동적 바인딩을 이용하여 필요없는 코드 제거

public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		Animal ani = null;
	
		while (true) {
			System.out.print("1.Dog\n2.Cat\n3.Fish\n4.Duck\n5.Exit\nSelect: ");
			n = s.nextInt();
			
			switch (n) {
				case 1: 
					ani = new Dog(); 
					break;
				case 2: 
					ani = new Cat(); 
					break;
				case 3: 
					ani = new Fish(); 
					break;
				case 4: 
					ani = new Duck(); 
					break;	
				case 5: 
					System.out.println("작업 종료");
					s.close();
					System.exit(0);
					break;	
			}
			ani.speak();
			ani.walk();
		}
	}

}
