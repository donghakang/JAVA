package solution;

/*[문제4]실행시 숫자 5개(a,b,c,d,e)을 args로 입력받아서 순서대로 출력하시오

[결과 화면]
java  ExamTest08   25  78  36 90 5

5  25  36  78 90
*/
public class ExamTest04 {
	public static void main(String[] args) {
        
        int len = args.length;
        if (len != 5) {
            System.out.println("실행시 숫자 5개를 입력하세요");
        } else {
            for (int i = 0; i < len; i ++) {
                System.out.print(args[i] + "\t");
            }
            System.out.println();
        }
	}
}
