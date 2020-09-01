package main;

public class MyThread2 extends Thread {
    ShareArea share;
    @Override
    public void run() {
        while (true) {
            if (share.flag) {
                System.out.println("HI, " + share.num);
                break;
            }
        }
        
    }
}