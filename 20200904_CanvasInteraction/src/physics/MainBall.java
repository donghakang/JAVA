package physics;

import java.awt.Color;

public class MainBall extends Ball {
    public boolean isRight = false;
    public boolean isLeft  = false;
    public boolean isUp    = false;
    public boolean isDown  = false;
    public boolean isFire    = false;

    public MainBall(int posX, int posY, int velX, int velY, int size, Color color) {
        super(200, 200, 0, 0, 70, Color.red);
    }


    public void limit() {
        int canvasX = getW();
        int canvasY = getH();
        if (posX > canvasX)          posX = -size;
        if (posX < -size)            posX = canvasX;
        if (posY < -size)            posY = canvasY;
        if (posY > canvasY)          posY = -size;
    }

    public void update() {
        if (isRight) posX += 3;
        if (isLeft)  posX -= 3;
        if (isUp)    posY -= 3;
        if (isDown)  posY += 3;
        
        this.limit();
    }

}
