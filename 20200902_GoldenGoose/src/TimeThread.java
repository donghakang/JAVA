public class TimeThread extends Thread {
    Goose goose;

    @Override
    public void run() {
        while (goose.isAlive) {
            try {
                if (goose.isEgg) {
                    Thread.sleep(2000);
                    goose.egg += 1;
                    System.out.println("   ㄴ " + goose.egg + "개...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
