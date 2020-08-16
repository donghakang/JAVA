public class Player {
    int x;
    int y;

    boolean key1;
    boolean key2;
    boolean dest;

    Player() {
        this.x = 2;
        this.y = 2;
        this.key1 = false;
        this.key2 = false;
    }



    void move(String key) {
        if (key.equals("W") || key.equals("w")) {
            this.y -= 1;
        } else if (key.equals("S") || key.equals("s")) {
            this.y += 1;
        } else if (key.equals("A") || key.equals("a")) {
            this.x -= 1;
        } else if (key.equals("D") || key.equals("d")) {
            this.x += 1;
        }
    }

    void enter(String key, Maze m) {
        int oldX = this.x;
        int oldY = this.y;
        int newX = this.x;
        int newY = this.y;

        if (key.equals("W") || key.equals("w")) {
            newY -= 1;
        } else if (key.equals("S") || key.equals("s")) {
            newY += 1;
        } else if (key.equals("A") || key.equals("a")) {
            newX -= 1;
        } else if (key.equals("D") || key.equals("d")) {
            newX += 1;
        }

        if (newX - oldX != 0) {
            if (m.sideDoor[oldY][Math.max(oldX, newX)]) {
                // 문 있
                this.x = newX;
            } else {
                System.out.println("문이 없어 이동 할 수 없습니다.");
            }
        } else if (newY - oldY != 0) {
            if (m.upDoor[Math.max(oldY, newY)][oldX]) {
                // 문
                if (newX == 0 && newY == 2) {
                    if (this.key1)  this.y = newY;
                    else            System.out.println("첫번째 열쇠가 없어, 이동 할 수 없습니다.");
                }
                if (newX == 4 && newY == 2) {
                    if (!this.key1)      System.out.println("첫번째 열쇠가 없어, 이동 할 수 없습니다");
                    else if (!this.key2) System.out.println("두번째 열쇠가 없어, 이동 할 수 없습니다.");
                    else                 this.y = newY;
                }
                this.y = newY;
            } else {
                System.out.println("문이 없어 이동 할 수 없습니다.");
            }
        }
    }

    void print() {
        System.out.println("Player는 [" + this.x + ", " + this.y + "] 에 있습니다.");
    }
}
