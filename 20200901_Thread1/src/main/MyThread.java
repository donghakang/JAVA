package main;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("쓰레드: " + i);
        }
    }
}
