package main;

public class Method {
	
	void Method1() {
		for (int i = 2; i < 10; i ++) {
			for (int j = 1; j < 10; j ++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
	
	void Method2(int n) {
		System.out.println(n + "ÀÇ ¹è¼ö");
		for (int i = 1; i < 10; i++) {
			System.out.println();
		}
	}
}
