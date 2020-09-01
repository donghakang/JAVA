package control;
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("쓰레드: " + i);
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
