
import java.awt.Color;
import java.util.Random;

public class Ball {
    int posX;
    int posY;
    double velX;
    double velY;
    int size;
    int w, h;
    boolean isRight;
    Color c;

    public Ball(final int posX, final int posY, final int size) {
        this.posX = posX;
        this.posY = posY;
        this.velX = 0.0;
        this.velY = 0.0;
        this.size = size;
        this.isRight = true;
    }


    public void setW(final int w) {
        this.w = w;
    }

    public void setH(final int h) {
        this.h = h;
    }

    public void setColor(final Color c) {
        this.c = c;
    }

    public void setVelX(final double velX2) {
        this.velX = velX2;
    }

    public void setDirection(final boolean isRight) {
        this.isRight = isRight;
    }

    

    public void update() {
        this.posY = (int)(this.posY + this.velY * 0.01);
        this.velY = this.velY + 9.8;
        
        if (isRight) {
            
            if (this.posX > w - this.size) {
                isRight = !isRight;
                
                this.posX = w-this.size-1;
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

        
        if (this.posY > this.h - this.size) {
            this.posY -= 1;
            this.velY *= -0.85;
        }
    }
}
