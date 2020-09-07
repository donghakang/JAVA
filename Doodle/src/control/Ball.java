package control;

import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class Ball {
    public int posX, posY;
    public double velX, velY;
    public int size = 50;
    public int canvasX, canvasY;

    public boolean isRight;
    public boolean isLeft;

    public boolean isFalling;

    // for game
    public int bounceCount = 0;
    public boolean isAlive = true;


    BufferedImage img;

    public Ball(int canvasX, int canvasY) {
        this.canvasX = canvasX;
        this.canvasY = canvasY;
        this.posX = canvasX / 2 - (this.size / 2);
        this.posY = canvasY / 4 - (this.size / 2);
        this.velX = 0.0;
        this.velY = 0.0;
        this.isRight = false;
        this.isLeft = false;
        this.isFalling = true;

        try {
            this.img = ImageIO.read(new File("./img/img1.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("READ FAIL");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
    }

    // 벽돌에 부딪힐때, 공은 위로 솟는다
    // 이 때, velY 가 다시 원점으로 돌아간다.
    public void bounceUp() {
        this.velY = -500;
        this.isFalling = false;
        this.bounceCount += 1;
    }

    
    public void update() {
        // 옆으로 움직이기
        if (this.isRight) this.posX += 7;                   
        if (this.isLeft)  this.posX -= 7;

        if (this.posX > this.canvasX + this.size) {
            this.posX = -this.size;
        } 
        if (this.posX < 0 - this.size) {
            this.posX = this.canvasX;
        }

        this.posY = (int)(this.posY + this.velY * 0.02);
        this.velY = this.velY + 9.8;
    
        // 바닥에 부딪힐때, 
        if (this.posY > this.canvasY - this.size)    this.isAlive = false;

        // 위에 도착했을때, 
        if (this.velY < 10 && this.velY > 0) {
            this.isFalling = true;
        }

    }

    
}
