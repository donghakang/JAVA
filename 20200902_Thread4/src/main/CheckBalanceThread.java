package main;

public class CheckBalanceThread extends Thread {
    ShareArea share;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (share) {                                          // 한묶음으로 처리하고 싶을때. 
                int sum = share.ac1.money + share.ac2.money;                // 간섭하기
                System.out.println("총 금액 : " + sum);
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

/**
 * 
 * synchronized public void show() {
        int sum = share.ac1.money + share.ac2.money;                // 간섭하기
        System.out.println("총 금액 : " + sum);
    }
 * 
 */
    
    
}
