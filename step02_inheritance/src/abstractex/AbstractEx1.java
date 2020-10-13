package abstractex;





//추상메서드가 없는 추상클래스
abstract class AA {
	public void view1() {}			// 1
	public void view2() {}			// 2
}

class BB extends AA {
	@Override
	public void view1() {
		
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
//		AA ob = new AA();		// 객체 생성 불가능,
//		ob.view1();				
		
		AA ob2 = new BB();
		ob2.view1();
		ob2.view2();
	}
}


////추상 클래스
//abstract class AA {
//	abstract public void view1(); 		// 1
//	public void view2() {}			// 2
//}
//
//class BB extends AA {
//	@Override
//	public void view1() {}		// 3 (재정의 강제성 O)
//}
//
//public class AbstractEx1 {
//	public static void main(String[] args) {
////		AA ob = new AA();		// 객체 생성 불가능,
////		ob.view1();				
//		
//		AA ob2 = new BB();
//		ob2.view1();
//		ob2.view2();
//	}
//}



//// 일반 클래스
//class AA {
//	public void view1() {} 		// 1
//	public void view2() {}		// 2
//}
//
//class BB extends AA {
//	@Override
//	public void view1() {}		// 3 (재정의 강제성 X)
//}
//
//public class AbstractEx1 {
//	public static void main(String[] args) {
//		AA ob = new AA();		// 객체 생성가능,
//		ob.view1();				
//		
//		AA ob2 = new BB();
//		ob2.view1();
//		ob2.view2();
//	}
//}
