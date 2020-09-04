package control;

import physics.Ball;
import physics.MainBall;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.util.ArrayList;
import java.util.Random;

public class MyCanvas extends Canvas {
    MyThread th;
    ArrayList<Ball> balls = new ArrayList<>();
    MainBall mainBall;
    int canvasX;
    int canvasY;
    boolean isBounce = false;


    public MyCanvas(int w, int h) {
        this.canvasX = w;
        this.canvasY = h;


        int posX, posY;
        double velX, velY;
        int size;
        Color color;
        for (int i = 0; i < 0; i ++) {
            posX = new Random().nextInt(this.canvasX);
            posY = new Random().nextInt(200);
            velX = new Random().nextInt(4);
            velY = 0.0;
            size = new Random().nextInt(30) + 30;

            int red   = new Random().nextInt(100);
            int green = new Random().nextInt(100);
            int blue  = new Random().nextInt(100);

            color = new Color(red + 155, green + 155, blue + 155, 255);

            Ball ball = new Ball(posX, posY, velX, velY, size, color);
            balls.add(ball);
        }

        mainBall = new MainBall(0, 0, 0, 0, 0, null);

        th = new MyThread();
        th.start();
    }

    public void addBall() {
        int posX, posY;
        double velX, velY;
        int size;
        Color color;

        posX = new Random().nextInt(200);
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


    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(new Color(0, 0, 255, 40));

        g2.setColor(Color.yellow);
        for (int i = 0; i < 10; i ++) {
            g2.fillOval(new Random().nextInt(this.canvasX), new Random().nextInt((int)(this.canvasY / 2)), 2, 2);
        }


        for (int i = 0; i < balls.size(); i ++) {
            Ball b = balls.get(i);
            g2.setColor(b.color);
            g2.fillOval(b.posX, b.posY, b.size, b.size);
        }
        
        g2.setColor(mainBall.color);
        g2.fillOval(mainBall.posX, mainBall.posY, mainBall.size, mainBall.size);
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


    class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                for (int i = 0; i < balls.size(); i++) {
                    Ball b = balls.get(i);
                    b.update();
                }
                mainBall.update();

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
