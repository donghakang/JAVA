package animal;

import java.util.Scanner;

// static binding = 정적바인딩
public class AnimalMain1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		Dog ob1 = null;
		Cat ob2 = null;
		Fish ob3 = null;
		Duck ob4 = null;
		
		while (true) {
			System.out.print("1.Dog\n2.Cat\n3.Fish\n4.Duck\n5.Exit\nSelect: ");
			n = s.nextInt();
			
			switch (n) {
				case 1: 
					ob1 = new Dog(); 
					ob1.speak();
					ob1.walk();
					break;
				case 2: 
					ob2 = new Cat(); 
					ob2.speak();
					ob2.walk();
					break;
				case 3: 
					ob3 = new Fish(); 
					ob3.speak();
					ob3.walk();
					break;
				case 4: 
					ob4 = new Duck(); 
					ob4.speak();
					ob4.walk();
					break;	
				case 5: 
					System.out.println("작업 종료");
					s.close();
					System.exit(0);
					break;	
			}
		}
	}

}
