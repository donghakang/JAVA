package control;

import physics.Ball;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.Random;

public class MyCanvas extends Canvas {
    ArrayList<Ball> balls = new ArrayList<Ball>();
    MyThread th = null;

    public MyCanvas(int w, int h) {
        int posX, posY;
        double velX, velY;
        int size;
        Color color;
        for (int i = 0; i < 20; i ++) {
            posX = new Random().nextInt(w);
            posY = new Random().nextInt(200);
            velX = new Random().nextInt(4) - 8;
            velY = 0.0;
            size = new Random().nextInt(30) + 30;

            int red   = new Random().nextInt(100);
            int green = new Random().nextInt(100);
            int blue  = new Random().nextInt(100);

            color = new Color(red + 155, green + 155, blue + 155, 255);

            Ball ball = new Ball(posX, posY, velX, velY, size, color);
            balls.add(ball);
        }
        th = new MyThread();
        th.start();
    }


    Image bufferImage;
    Graphics buffg;

    @Override
    public void paint(Graphics g) {
        if (buffg == null) {
            bufferImage = createImage(getWidth(), getHeight());
            if (bufferImage == null)
                System.out.println("���� ����");
            else
                buffg = bufferImage.getGraphics();
        }
    }

    /**
    @Override
    public void update(Graphics g) {
        buffg.drawImage(bufferImage, 0, 0, this);
        buffg.setColor(Color.blue);
        buffg.fillRect(0, 0, getWidth(), getHeight());

        for (int i = 0; i < ballArr.size(); i++) {
            Ball ball = ballArr.get(i);
            buffg.setColor(ball.getColor());
            buffg.fillOval(ball.getPosX(), ball.getPosY(), ball.getSize(), ball.getSize());
        }

        g.drawImage(bufferImage, 0, 0, this);
    }
    **/


    //	int speedX = 5;
//	int speedY = 5;
//	int posX = 200;
//	int posY = 120;
    class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {

                for (int i = 0; i < balls.size(); i++) {
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
