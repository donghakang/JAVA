import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList �� Array�� ������
		// Array �� ũ�⸦ ���ؾ��Ѵ�. ���̰� �ڵ����� �þ�� �ڵ����� ���� �� �ִ�.
		
		ArrayList<String> strArr   = new ArrayList<>();
		ArrayList<Integer> intArr  = new ArrayList<>();
		ArrayList<Boolean> boolArr = new ArrayList<>();
		ArrayList<Float> floatArr  = new ArrayList<>();
		
		System.out.println("size: " + strArr.size()); 		// strArr �� ����
		strArr.add("��");
		strArr.add("��");									// strArr �� ���Ѵ�
		strArr.add("��");
		strArr.add("��");
		strArr.add(1, "��");									// Ư����ġ�� ���Ѵ�
		
		strArr.set(0,  "��");  								// set: Ư����ġ�� ����
		strArr.set(2, "��");
		strArr.remove(3);									// remove: Ư����ġ ���� ����
		
		
		
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		System.out.println(strArr.indexOf("��"));			// "��"�� ��ġ
		System.out.println(strArr.lastIndexOf("��"));			// "��"�� ��ġ
		
		System.out.println("size: " + strArr.size()); 
		
		System.out.println(strArr.get(0)); 					// 0 ��° �θ���
		
//		for (int i = 0; i < strArr.size(); i ++) {
//			System.out.println(strArr.get(i));
//		}
		
		
		strArr.clear();										// ���� ����
		System.out.println("size: " + strArr.size()); 
		
		
	}
}
