package Game;

import java.util.Random;

public class Player {
    public boolean isTurn;
    public int health;

    public Player(boolean isTurn, int health) {
        this.isTurn = isTurn;
        this.health = health;
    }

    // 공격력. 10~20 사이의 공격이다.
    public int power() {
        return new Random().nextInt(10) + 10;
    }

    // 생명력 조절
    public void changeHealth(int num) {
        this.health += num;
    }

    public void limitHealth(int total) {
        if (this.health > total)    this.health = total;
    }

    // 프린트
    public void print() {
        System.out.println("Player1 생명력: " + this.health);
    }

}