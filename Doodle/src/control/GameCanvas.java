package control;

import javax.imageio.ImageIO;
import java.awt.*;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class GameCanvas extends Canvas {
    // 환경
    int canvasX;
    int canvasY;

    int[] bgColor = new int[3];
    boolean isBrighter = false;
    int bgColorTmp = 0;

    // 게임
    Actors actor;

    public boolean isGameMode;          // 실행화면 혹은 게임화면
    BufferedImage img;

    public GameCanvas(int canvasX, int canvasY) {
        this.canvasX = canvasX;
        this.canvasY = canvasY;
        this.isGameMode = false;
        this.bgColor[0] = 12;
        this.bgColor[1] = 6;
        this.bgColor[2] = 42;

        init();
    }



    public void init() {
        try {
            this.img = ImageIO.read(new File("./img/launch_img.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("READ FAIL");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
        
        actor = new Actors(this.canvasX, this.canvasY);
        this.isBrighter = false;
        this.bgColorTmp = 0;
        
        TimeThread th = new TimeThread();
        th.start();
    }


    public synchronized void scoreAdd() {
        if (!actor.ball.isFalling) {
            this.actor.score += 3;
        }
    }


    public void updateBackground() {
        int tmp = 0;
        tmp = this.actor.score / 10 - (200 * this.bgColorTmp);

        if (this.isBrighter) {
            this.bgColor[0] = 212 - tmp;
            this.bgColor[1] = 206 - tmp;
            this.bgColor[2] = 242 - tmp;
        } else {
            this.bgColor[0] = tmp + 12;
            this.bgColor[1] = tmp + 6;
            this.bgColor[2] = tmp + 42;
        }

        if (tmp % 200 == 199) {
            this.bgColorTmp += 1;
            this.isBrighter = !this.isBrighter;
        }
    }

    public void updateBrickColor() {
        int tmp = 0;
        tmp = this.actor.score / 10 - (200 * this.bgColorTmp);

        if (this.isBrighter) {
            Color c = new Color (tmp + 0, tmp + 55, tmp + 20);
            for (int i = 0; i < this.actor.bricks.size(); i ++) {

                this.actor.bricks.get(i).color = c;
            }
        } else {
            Color c = new Color (200 - tmp, 255 - tmp, 220 - tmp);
            for (int i = 0; i < this.actor.bricks.size(); i ++) {

                this.actor.bricks.get(i).color = c;
            }
        }
    }


    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Font font = new Font("Arial", Font.BOLD, 80);
        Font font2 = new Font("Arial", Font.PLAIN, 30);

        if (this.isGameMode) {
            try {
                updateBackground();
                updateBrickColor();
                setBackground(new Color(this.bgColor[0], this.bgColor[1], this.bgColor[2], 255));
            } catch (IllegalArgumentException e) {
                System.out.println(this.bgColor[0] + "   " + this.bgColor[1] + "    " + this.bgColor[2]);
            }

            for (int i = 0; i < actor.bricks.size(); i++) {
                g2.setColor(actor.bricks.get(i).color);
                Brick brick = actor.bricks.get(i);
                g2.fillRect(brick.posX, brick.posY, 100, 20);
            }
        
            // Player
            g2.drawImage(actor.ball.img, actor.ball.posX - 25, actor.ball.posY - 25, this);


            g2.setFont(font2);
            g2.setColor(Color.white);
            g2.drawString("Score: " + this.actor.score, 50, 90);

            // 게임 오버
            if (!actor.ball.isAlive) {
                g2.setFont(font);
                g2.setColor(Color.white);
                this.isBrighter = false;
                this.bgColorTmp = 0;
                g2.drawString("G A M E O V E R", this.canvasX / 6 + 20, this.canvasY / 2 - 100);

                g2.setFont(font2);
                g2.drawString("다시 플레이 하시려면 Y 를 누르시오", this.canvasX / 4 + 20, this.canvasY * 3 /4 );
            }
        } else {
            this.actor.score = 0;
            setBackground(new Color(this.bgColor[0], this.bgColor[1], this.bgColor[2], 255));

            g2.drawImage(this.img, 0, 0, this);

            g2.setFont(font);
            g2.setColor(Color.white);
            g2.drawString("D O O D L E", this.canvasX / 6 + 20, this.canvasY / 2 - 100);
            g2.drawString("   E G I  ", this.canvasX/2 + 35, this.canvasY/2);


            g2.setFont(font2);
            g2.setColor(Color.gray);
            g2.drawString("Press <space> to Start", this.canvasX/2 - 180, this.canvasY * 3 / 4);


            Font f = new Font("Arial", Font.PLAIN, 10);
            g2.setFont(f);
            g2.setColor(Color.yellow);
            g2.drawString("참고로, 애기는 저의 집 강아지 이름입니다.", this.canvasX * 1 / 2 + 100, this.canvasY/2 + 100);
            g2.drawString("13살 입니다.", this.canvasX * 1 / 2 + 100, this.canvasY/2 + 120);
        }
    }

    class TimeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                actor.update();
                scoreAdd();
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
