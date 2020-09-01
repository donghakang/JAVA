package main;

public class MyThread extends Thread {
    int sec = 0;
    Boolean running = true;

    @Override
    public void run() {                                  // 쓰레드 구현
        while (running) {
            try {
                Thread.sleep(1000);   
                this.sec += 1;    
                // System.out.println(sec + " seconds ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int returnSecond() {
        return this.sec;
    }

    public void end() {
        this.running = false;
    }
}