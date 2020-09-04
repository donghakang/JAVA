package physics;

import control.Control;

import java.awt.*;

public class Ball extends Control {

    public int posX;
	public int posY;
    public double velX, velY;
    public int size;
    public Color color;
    public boolean isRight;


    public Ball(int posX, int posY, double velX, double velY, int size, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.size = size;
        this.color = color;
        if (this.velY > 0) this.isRight = true;
        else               this.isRight = false;
    }

    public void update() {
        int w = getW();
        int h = getH();

        this.posY = (int)(this.posY + this.velY * 0.01);
        this.velY = this.velY + 9.8;

        if (isRight) {

            if (this.posX > w - this.size) {
                isRight = !isRight;

                this.posX = w - this.size-1;
                this.velX *= -.95;
            }
            this.posX = (int)(this.posX + this.velX);
        } else {

            if (this.posX < 0) {
                isRight = !isRight;

                this.posX = 1;
                this.velX *= -.95;
            }
            this.posX = (int)(this.posX + this.velX);
        }


        if (this.posY > h - this.size) {
            this.posY -= 1;
            this.velY *= -0.85;
        }
    }

}
