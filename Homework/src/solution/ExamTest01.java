package solution;

import java.util.HashSet;
import java.util.Set;

/* [문제1]
10보다 작은 자연수 중에서 3또는 5의 배수는 3,5,6,9 이고 이것을 모두 더하면 23이다.
1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

[결과화면]
합 : 234168
*/
public class ExamTest01 {
	public static void main(String[] args) {
		int sum=0;
		
		Set<Integer> threeFive = new HashSet<Integer>();

		for (int i = 0; i < 1000; i += 3) {
			threeFive.add(i);
		}
		for (int i = 0; i < 1000; i += 5) {
			threeFive.add(i);
		}

		for (int i : threeFive) {
			sum += i;
		}


		System.out.println("합 : " + sum);
	}
}
