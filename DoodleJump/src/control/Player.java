package control;

import physics.Physics;

public class Player extends Physics {
    
    public int canvasX, canvasY;

    public int size = 20;

    public boolean isRight;
    public boolean isLeft;

    public boolean isFalling;

    // for game
    public int bounceCount = 0;
    public boolean isAlive = true;

    // id
    private String name;

    public Player(int canvasX, int canvasY) {
        setCanvas(canvasX, canvasY);
        setPosX(canvasX / 2 - (this.size / 2));
        setPosY(canvasY / 4 - (this.size / 2));
        setVelX(0.0);
        setVelY(0.0);
        this.size = 50;
        this.isRight = false;
        this.isLeft = false;
        this.isFalling = true;
        this.name = "NO";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCanvas(int canvasX, int canvasY) {
        this.canvasX = canvasX;
        this.canvasY = canvasY;
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
