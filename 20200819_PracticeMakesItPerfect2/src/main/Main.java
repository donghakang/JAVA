package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		ArrayList <Class1> classes = new ArrayList<>();
		int num1, num2, ch_;
		
		for (int i = 0; i < 5; i++ ) { 
			num1 = new Random().nextInt(10);
			num2 = new Random().nextInt(10);
			ch_  = new Random().nextInt(4);
			
			Class1 c = new Class1();
			
			if (ch_ == 0) {
				c = new Class1(num1, num2, "+");
			} else if (ch_ == 1) {
				c = new Class1(num1, num2, "-");
			} else if (ch_ == 2) {
				c = new Class1(num1, num2, "*");
			} else if (ch_ == 3) {
				c = new Class1(num1, num2, "/");
			} 
			
			
			classes.add(c);
		}
		
		for (int i = 0; i < classes.size(); i++) {
			System.out.println(classes.get(i).operate());
		}
	}
}
