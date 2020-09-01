package main;

import java.io.File;

interface InterBoard {
	
	// 추상 메서드를 가지고 있어, 무조건 Override 시키위해서 
	// 상속 받은 아이에게 메소드를 무조건 전수 하기위해서
	abstract void upload(String url, File file);	
	abstract void requestUp(); 
	abstract void requestDelete();
	void print();			// abstract 이 없다고 하더라도, interface는 무조건 abstract을 더해준다
	
}
