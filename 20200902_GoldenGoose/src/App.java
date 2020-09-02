import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input;
        
        Goose goose = new Goose();
        

        TimeThread th1 = new TimeThread();
        th1.goose = goose;
        th1.start();

        PauseThread th2 = new PauseThread();
        th2.goose = goose;
        th2.start();

        System.out.println("거위가 황금알을 낳는다!!! ");

        while (true) {
            input = scan.nextLine();
            if (input.equals("")) {
                
                goose.isEgg = false;
            } else if (input.equals("x")) {
                goose.isAlive = false;
                break;
                
            }
        }
        System.out.println("총 황금알 갯수: " + goose.totalEgg + "개");

        scan.close();
    }
}
