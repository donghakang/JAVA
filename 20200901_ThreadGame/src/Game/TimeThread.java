package Game;

public class TimeThread extends Thread {
    int sec = 0;
    boolean t = false;
    volatile boolean gameOver = true;

    @Override
    public void run() {
        while (gameOver) {
            try {
                if (t) {
                    Thread.sleep(1000);
                    this.sec += 1;
                } 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}