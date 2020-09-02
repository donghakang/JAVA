package main;

public class Main {
    public static void main(String[] args) throws Exception {
        Account ac1 = new Account();
        ac1.money   = 1000;
        ac1.name    = "A";
        Account ac2 = new Account();
        ac2.money   = 2000;
        ac2.name    = "B";

        ShareArea share = new ShareArea();
        share.ac1 = ac1;
        share.ac2 = ac2;

        TransferThread th1     = new TransferThread();
        CheckBalanceThread th2 = new CheckBalanceThread();
        th1.share = share;
        th2.share = share;


        th1.start();
        th2.start();

    }
}
