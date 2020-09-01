package main;

public class MyThread1 extends Thread {
    ShareArea share;
    @Override
    public void run() {
        share.num = 0;
        for (int i = 0; i < 50000; i ++) {
            for (int j = 0; j < 50000; j ++) {
                if (j % 2 == 0) {
                    share.num += 100;
                } else {
                    share.num -= 100;
                }
            }
        }
        share.num = -1;
        share.flag = true;
        System.out.println("HELLO, " + share.num);
    }
}