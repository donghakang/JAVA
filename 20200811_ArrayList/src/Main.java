import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList 와 Array의 차이점
		// Array 는 크기를 정해야한다. 길이가 자동으로 늘어난뒤 자동으로 줄일 수 있다.
		
		ArrayList<String> strArr   = new ArrayList<>();
		ArrayList<Integer> intArr  = new ArrayList<>();
		ArrayList<Boolean> boolArr = new ArrayList<>();
		ArrayList<Float> floatArr  = new ArrayList<>();
		
		System.out.println("size: " + strArr.size()); 		// strArr 의 길이
		strArr.add("가");
		strArr.add("나");									// strArr 를 더한다
		strArr.add("다");
		strArr.add("라");
		strArr.add(1, "마");									// 특정위치에 더한다
		
		strArr.set(0,  "고");  								// set: 특정위치에 변경
		strArr.set(2, "해");
		strArr.remove(3);									// remove: 특정위치 물건 제거
		
		
		
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		strArr.add("가");
		System.out.println(strArr.indexOf("가"));			// "마"의 위치
		System.out.println(strArr.lastIndexOf("가"));			// "마"의 위치
		
		System.out.println("size: " + strArr.size()); 
		
		System.out.println(strArr.get(0)); 					// 0 번째 부르기
		
//		for (int i = 0; i < strArr.size(); i ++) {
//			System.out.println(strArr.get(i));
//		}
		
		
		strArr.clear();										// 전부 삭제
		System.out.println("size: " + strArr.size()); 
		
		
	}
}
