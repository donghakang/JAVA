package abstractex;





//�߻�޼��尡 ���� �߻�Ŭ����
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
//		AA ob = new AA();		// ��ü ���� �Ұ���,
//		ob.view1();				
		
		AA ob2 = new BB();
		ob2.view1();
		ob2.view2();
	}
}


////�߻� Ŭ����
//abstract class AA {
//	abstract public void view1(); 		// 1
//	public void view2() {}			// 2
//}
//
//class BB extends AA {
//	@Override
//	public void view1() {}		// 3 (������ ������ O)
//}
//
//public class AbstractEx1 {
//	public static void main(String[] args) {
////		AA ob = new AA();		// ��ü ���� �Ұ���,
////		ob.view1();				
//		
//		AA ob2 = new BB();
//		ob2.view1();
//		ob2.view2();
//	}
//}



//// �Ϲ� Ŭ����
//class AA {
//	public void view1() {} 		// 1
//	public void view2() {}		// 2
//}
//
//class BB extends AA {
//	@Override
//	public void view1() {}		// 3 (������ ������ X)
//}
//
//public class AbstractEx1 {
//	public static void main(String[] args) {
//		AA ob = new AA();		// ��ü ��������,
//		ob.view1();				
//		
//		AA ob2 = new BB();
//		ob2.view1();
//		ob2.view2();
//	}
//}
