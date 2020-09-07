package control;

import java.util.Random;
import java.awt.Color;


// 부딪히면 없어지는 벽돌
public class Brick {
    int posX;
    int posY;
    int canvasX, canvasY;
    int width = 100;
    int height = 20;

    Color color;


    public Brick(int w, int h) {
        this.posX = new Random().nextInt(w);
        this.posY = new Random().nextInt(h);
        this.canvasX = w;
        this.canvasY = h;
        this.color = Color.ORANGE;
    }

    public void changeColor() {
        this.color = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255), 255);
    }

    public void reset() {
        if (this.posY > this.canvasY) {
            this.posX = new Random().nextInt(this.canvasX);
            this.posY = 0;
        }    
    }

}
