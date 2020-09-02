public class CheckBalanceThread extends Thread {
    ShareArea share;

    @Override
    public void run() {
        while (true) {
            synchronized (share) {
                share.num += 1;
                System.out.println("   ㄴ " + share.num + "개 ... .");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
