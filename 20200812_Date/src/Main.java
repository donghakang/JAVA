import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf0, sdf1, sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf0 = new SimpleDateFormat("yyyyMMdd");
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy�� MM�� dd�� E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sdf5 = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		sdf6 = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		sdf7 = new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		sdf8 = new SimpleDateFormat("������ �� ���� W��° ���Դϴ�.");
		sdf9 = new SimpleDateFormat("������ �� ���� F��° E���� �Դϴ�.");
		
		System.out.println(sdf0.format(date));
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		System.out.println(sdf5.format(date));
		System.out.println(sdf6.format(date));
		System.out.println(sdf7.format(date));
		System.out.println(sdf8.format(date));
		System.out.println(sdf9.format(date));
	}

}

