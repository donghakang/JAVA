package main;

public class Main {
    public static void main(String[] args) {
        ShareArea share = new ShareArea();

        MyThread1 th1 = new MyThread1();
        th1.share = share;
        MyThread2 th2 = new MyThread2();
        th2.share = share;

        th1.start();
        th2.start();
    }
}