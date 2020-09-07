package control;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Actor {
    public int canvasX, canvasY;

    // 게임요소들
    public Player player;
    public ArrayList<Brick> bricks;
    public boolean isGameMode;

    public int bounceCount;  // 바닥 부딪히는 횟수
    public int score;

    public Actor(int canvasX, int canvasY) {
        // 발판 setup
        this.canvasX = canvasX;
        this.canvasY = canvasY;

        init();
    }


    public void init() {
        // 새로 시작함으로서, 데이터를 저장하는거와는 다르게 그냥 새로운 player 클래스를 생성한다.
        this.bounceCount = 0;
        this.score = 0;
        this.bricks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Brick brick = new Brick(this.canvasX, this.canvasY);
            this.bricks.add(brick);
        }
        this.player = new Player(this.canvasX, this.canvasY);
    }






    // 부딪히면 true
    public boolean collide(Player player, Brick brick) {
        return lineCircle(brick.posX, brick.posY, brick.posX + brick.width, brick.posY,
                player.posX + player.size / 2, player.posY + player.size / 2, player.size / 2);

    }

    // 부딪힘 확인
    public void collision() {
        // 떨어질때만, 부딪히는게 허용
        if (player.isFalling) {
            for (int i = 0; i < bricks.size(); i ++) {
                Brick b = bricks.get(i);
                if (collide(player, b)) {
                    player.bounceUp();
                    this.bounceCount += 1;

                    // 레벨이 올라갑니다
                    // 최소 블락 5개는 유지 합니다.
                    if (this.bricks.size() > 5) {
                        if (this.bounceCount % 5 == 0) {
                            bricks.remove(b);
                            i--;
                        }
                    }
                }
            }
        }
    }

    // 공이 어느 리밋 이상으로 이동할 시에는 스피드와 위치를 변경한다.
    public void limiter() {
        if (player.posY < this.canvasY / 6) {
            player.posY += 5;
            for (int i = 0; i < bricks.size(); i ++) {
                bricks.get(i).posY += 5;
            }
        }
    }




    public void update() {
        if (isGameMode) {
            player.update();
            for (int i = 0; i < bricks.size(); i++) {
                Brick b = bricks.get(i);
                if (player.velY < 0) {
                    b.posY = (int) (b.posY - player.velY * 0.02);
                }
                b.reset();
            }
            limiter();
            collision();
        } else {
            init();
        }
    }













    // MARK: MATH EQUATIONS


    public double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    // Line Circle collision detection
    boolean lineCircle(double x1, double y1, double x2, double y2, double cx, double cy, double r) {

        boolean inside1 = pointCircle(x1,y1, cx,cy,r);
        boolean inside2 = pointCircle(x2,y2, cx,cy,r);
        if (inside1 || inside2) return true;

        double distX = x1 - x2;
        double distY = y1 - y2;
        double len = Math.sqrt( (distX*distX) + (distY*distY) );

        double dot = ( ((cx-x1)*(x2-x1)) + ((cy-y1)*(y2-y1)) ) / Math.pow(len,2);

        double closestX = x1 + (dot * (x2-x1));
        double closestY = y1 + (dot * (y2-y1));

        boolean onSegment = linePoint(x1,y1,x2,y2, closestX,closestY);
        if (!onSegment) return false;

        distX = closestX - cx;
        distY = closestY - cy;
        double distance = Math.sqrt( (distX*distX) + (distY*distY) );

        if (distance <= r) {
            return true;
        }
        return false;
    }


    // POINT/CIRCLE
    boolean pointCircle(double px, double py, double cx, double cy, double r) {
        double distX = px - cx;
        double distY = py - cy;
        double distance = Math.sqrt( (distX*distX) + (distY*distY) );

        if (distance <= r) {
            return true;
        }
        return false;
    }


    // LINE/POINT
    boolean linePoint(double x1, double y1, double x2, double y2, double px, double py) {
        double d1 = dist(px,py, x1,y1);
        double d2 = dist(px,py, x2,y2);

        double lineLen = dist(x1,y1, x2,y2);

        double buffer = 0.1;    // higher # = less accurate
        if (d1+d2 >= lineLen-buffer && d1+d2 <= lineLen+buffer) {
            return true;
        }
        return false;
    }

    public double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
    }
}
