package main;

public class TransferThread extends Thread {
    ShareArea share;

    @Override
    public void run() {
        for (int i = 0; i < 10; i ++) {
            
            share.ac1.money -= 10;
            System.out.println(share.ac1.name + " 인출");

            share.ac2.money += 10;
            System.out.println(share.ac2.name + " 입금");
        }
    }
    
}
