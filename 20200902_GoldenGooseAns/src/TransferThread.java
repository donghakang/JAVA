import java.util.Scanner;

public class TransferThread extends Thread {
    ShareArea share;

    @Override
    public void run() {
        int total = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            scan.nextLine();
            synchronized (share) {
                total += share.num;
                share.num = 0;

                System.out.println("달걀 회수 중..");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("달걀 회수 완료!");
                System.out.println("현재 달걀 수: " + total + "개");
            }
        }
    }

}