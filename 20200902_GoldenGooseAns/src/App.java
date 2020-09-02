public class App {
    public static void main(String[] args) throws Exception {
        ShareArea share = new ShareArea();
        TransferThread  th1 = new TransferThread();
        CheckBalanceThread th2 = new CheckBalanceThread();

        th1.share = share;
        th2.share = share;

        th1.start();
        th2.start();

    }
}
