
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class MyCanvas extends Canvas {
    ArrayList <Ball> balls;
    MyThread th;
    int w, h;

    public MyCanvas(int w, int h) {
        this.w = w;
        this.h = h;
        balls = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Ball b = new Ball(new Random().nextInt(this.w),
                              new Random().nextInt(200),
                              new Random().nextInt(30) + 30);
            b.setH(h);
            b.setW(w);

            int vel = new Random().nextInt(4) - 8;
            if (vel > 0)  b.setDirection(true);
            else          b.setDirection(false);
            b.setVelX(vel);


            int red   = new Random().nextInt(100);
            int green = new Random().nextInt(100);
            int blue  = new Random().nextInt(100);
        
            b.setColor(new Color(red + 155, green + 155, blue + 155, 255));
            
            balls.add(b);
        }

        th = new MyThread();
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(new Color(0, 0, 255, 40));

        g2.setColor(Color.yellow);
        for (int i = 0; i < 10; i ++) {
            g2.fillOval(new Random().nextInt(this.w), new Random().nextInt((int)(this.h / 2)), 2, 2);
        }

        /**
         *
        g2.setColor(Color.white); // 네모 테두리의 색깔
        g2.drawRect(100, 100, 150, 150);
        g2.fillRect(200, 100, 150, 150); // 색깔이 채워져 있는 사각형

        g2.setColor(Color.red);
        g2.drawRect(200, 200, 150, 150);

        g2.drawOval(400, 200, 50, 50); // 동그라미 그리기
        g2.fillOval(posX, 200, 100, 50);

        g2.setColor(Color.black);
        g2.drawLine(0, 0, 500, 500); // 선그리기

        g2.drawString("캔버스 연습", 600, 400);
         */

        for (int i = 0; i < balls.size(); i ++) {
            Ball b = balls.get(i);
            g2.setColor(b.c);
            g2.fillOval(b.posX, b.posY, b.size, b.size);
        }
    }

    class MyThread extends Thread {
        @Override
        public void run() {

            while (true) {
                for (int i = 0; i < balls.size(); i ++) {
                    Ball b = balls.get(i);
                    b.update();
                }
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    
    }
}
