import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		
		/**
		 *
		 * 1. �̹� ���� 1�Ϸ� ����
		 * 2. �̹��� 1���� ������ ��������
		 * 3. �ش��ϴ� ���Ϻ��� �Ͽ��ϱ��� �Ÿ��� ����
		 * 4. ���� �޷� �̵�
		 * 5. �������� ������ ���� ���� ���� ����
		 * 6. '3'���� ���� ����ŭ �ݺ��ϸ� 5������ ���� ����  -1 �־���
		 * 
		 * 7. �̹� �޷� �̵�
		 * 8. �̹� ���� ������ ���� ���� ���� ���ϱ�
		 * 9. '8'�� ���� ���� ����ŭ �ݺ��ϸ鼭 1���� �־���.
		 * 
		 * 10. �̹����� ������ ���� ����
		 * 11. �̹����� ������ �� ������ ����
		 * 12. �ش��ϴ� ���Ϻ��� ����� ���� �Ÿ��� ����
		 */
		Calendar cal = Calendar.getInstance();
		
		// find the beginning
		cal.set(Calendar.DATE, 1);                      // 8/1 
		System.out.println(cal.get(Calendar.MONTH)+ "  " + cal.get(Calendar.DATE));
		
		
		int pastMonth, currMonth, nextMonth;
		int pastDay, currDay, nextDay;
		int pastDOW, currDOW, nextDOW;
		
		int diff1, diff2; 
		int startDate, endDate;
		
		currMonth = cal.get(Calendar.MONTH);
		currDay   = cal.get(Calendar.DATE);
		currDOW   = cal.get(Calendar.DAY_OF_WEEK);
		
		cal.add(Calendar.DATE, -1);						// 7/31
		
		pastMonth = cal.get(Calendar.MONTH);
		pastDay   = cal.get(Calendar.DATE);
		
		diff1 = currDOW - 1;
		startDate = pastDay - diff1 + 1;
		// if 31�� �� �Ͽ��� , 1���� ������, ���� �Ѱ� ���� 31�� �ִ�.
		
		cal.add(Calendar.MONTH, 1);                     // 8/31
		currDay = cal.get(Calendar.DATE);
		nextDOW = cal.get(Calendar.DAY_OF_WEEK);
		
		diff2 = 7 - nextDOW;
		endDate = diff2;
		
		
		System.out.println(startDate + "   " + endDate);
		
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DATE, startDate);
		
		int totalDays = diff1 + diff2 + currDay;
		int[] calendar = new int[totalDays];
		
		for (int i = 0; i < totalDays; i ++) {
			calendar[i] = cal.get(Calendar.DATE);
			cal.add(Calendar.DATE, 1);
		}
		
		
		for (int i = 0; i < totalDays; i ++) {
			if (i % 7 == 0) System.out.println();
			System.out.print(calendar[i] + "   ");
		}
		
		
	}

}
