package control;

import java.util.Random;
import physics.Physics;
import java.awt.Color;


// 부딪히면 없어지는 벽돌
public class Brick extends Physics {
    int canvasX;
    int canvasY;

    public int width = 80;
    public int height = 10;

    public Color color;

    

    public Brick(int canvasX, int canvasY) {
        setCanvas(canvasX, canvasY);
        setPosX(new Random().nextInt(this.canvasX));
        setPosY(new Random().nextInt(this.canvasY));
    }

    public void setCanvas(int canvasX, int canvasY) {
        this.canvasX = canvasX;
        this.canvasY = canvasY;
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
