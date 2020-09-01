import java.util.HashSet;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// The easiest way.
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() < 6) {
			lotto.add(new Random().nextInt(45));
		}
		
		
		// Teacher's way
		
		Random rd = new Random();
		int[] Lotto = new int[6];
		
		for (int i = 0; i < Lotto.length; i++) {
			boolean isSelected = false;
			int ranNum = rd.nextInt(45) + 1;
			
			for (int j = 0; j < Lotto.length; j ++) {
				if (Lotto[i] == ranNum) {
					isSelected = true;
				}
			}
			if (isSelected == true) i --;
			else {
				Lotto[i] = ranNum;
			}
		}
		
		System.out.print("Lotto Numbers are ");
		for (int j = 0; j < 6; j ++) {
			System.out.print(Lotto[j] + ", ");
		}
		System.out.println();
		
		
		// Lotto ��ȣ �� 1 ~ 45 ���� �ߺ����� �ʴ� ���ڸ� 6�� �̴´�.
		
		int[] lottoNumber = new int[6];
		int number;
		int pos = 0;
		boolean repeated = false;
		
		while (true) {
			number = new Random().nextInt(45) + 1;
		
			System.out.println();
			for (int i = 0; i <= pos; i ++) {
				if (lottoNumber[i] == number) {  	// ���� ���ڰ� ���ٸ�, �ߺ��Ǿ������� �˷���
					repeated = true;
					break;
				} 
			}
			
			if (repeated) {
				repeated = false;
				continue;
			} else {
				repeated = false;
				lottoNumber[pos] = number;
				pos += 1;
			}
			
			
			if (pos == 6) break;					// 6���� �� ä�������� break.
		}
		
		
	
		System.out.print("Lotto Numbers are ");
		for (int j = 0; j < 6; j ++) {
			System.out.print(lottoNumber[j] + ", ");
		}
		System.out.println();


	}

}
