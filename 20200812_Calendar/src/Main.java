import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		
		/**
		 *
		 * 1. 이번 달의 1일로 세팅
		 * 2. 이번달 1일의 요일을 가져오기
		 * 3. 해당하는 요일부터 일요일까지 거리를 구함
		 * 4. 저번 달로 이동
		 * 5. 저번달의 마지막 날이 몇일 인지 구함
		 * 6. '3'번에 구한 값만큼 반복하면 5번에서 구한 값을  -1 넣어줌
		 * 
		 * 7. 이번 달로 이동
		 * 8. 이번 달의 마지막 날이 몇일 인지 구하기
		 * 9. '8'번 번에 구한 값만큼 반복하면서 1부터 넣어줌.
		 * 
		 * 10. 이번달의 마지막 날로 세팅
		 * 11. 이번달의 마지막 날 요일을 구함
		 * 12. 해당하는 요일부터 토요일 까지 거리를 구함
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
		// if 31일 이 일요일 , 1일은 월요일, 차이 한개 나면 31은 있다.
		
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
