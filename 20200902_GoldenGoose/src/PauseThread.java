public class PauseThread extends Thread {
    Goose goose;

    @Override
    public void run() {
        while (goose.isAlive) {
            if (!goose.isEgg) {
                synchronized (goose) {
                    System.out.println("달걀 가져다 놓는 중...");
                    try {
                        
                        goose.totalEgg += goose.egg;
                        Thread.sleep(7000);
                        System.out.println("달걀을 비웠습니다!");

                        goose.egg = 0;
                        goose.isEgg = true;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } 
        }
    }
}
