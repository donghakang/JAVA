import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		
		
		
		Calendar cal = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);
		String inputDate;
		
		while (true) {
			int yy = 0;
			int MM = 0;
			
			while (true) {
				System.out.print("오늘의 달력을 보기 위해, 년, 월을 입력하세요 (yyyy/MM):   ");
				inputDate = scan.nextLine();
				
				
				
				if (inputDate.indexOf("-") != -1) {
					yy = Integer.parseInt(inputDate.substring(0, inputDate.indexOf("-")));
					MM = Integer.parseInt(inputDate.substring(inputDate.indexOf("-") + 1));
					break;
				} else {
					continue;
				}
			}
			
			
			cal.set(Calendar.YEAR, yy);
			cal.set(Calendar.MONTH, MM - 1);
					
					
			int calendarSize;
		
			
			int currMonth = cal.get(Calendar.MONTH);  		// 7  (8월)
			int currMax = cal.getActualMaximum(Calendar.DATE);  // 31일
			
			
			// 이전 달
			cal.set(Calendar.DATE, 1);						// 8-1
			int currDate  = cal.get(Calendar.DAY_OF_WEEK);  // 수요일이면 4
			int prevDiff  = currDate - 1;
			
			
			cal.add(Calendar.DATE, -1);
			int prevMax   = cal.get(Calendar.DATE);
			
			
			
			// 다음 달
			cal.add(Calendar.DATE, 1);
			cal.set(Calendar.DATE, currMax);
			int nextDate = cal.get(Calendar.DAY_OF_WEEK);  // 날짜 확인
			int nextDiff = 7 - nextDate;
			
			
			calendarSize = (currMax + prevDiff + nextDiff);

			int[] calendar = new int[calendarSize];
			cal.set(Calendar.DATE, 1);
			cal.add(Calendar.DATE, -prevDiff);
			
			System.out.println(yy + "년   " + MM + "월");
			for (int i = 0; i < calendarSize; i ++) {
				calendar[i] = cal.get(Calendar.DATE);
				if (i % 7 == 0) {
					System.out.println();
				}
				System.out.print(cal.get(Calendar.DATE) + "  ");
				
				cal.add(Calendar.DATE, 1);
			}
			
			
			System.out.print("\n\n 이전으로              다음으로");
			String input = scan.nextLine();
			
			if (input.equals("Y") || input.equals("y")) continue;
			else break;
		}

		
	}
}
