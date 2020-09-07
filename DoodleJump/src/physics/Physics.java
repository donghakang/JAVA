package physics;

public class Physics {
    public   int posX, posY;
    public   double velX, velY;



    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public double getVelX() {
        return this.velX;
    }

    public double getVelY(){
        return this.velY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
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
