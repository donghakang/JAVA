package Game;

import java.util.Scanner;

public class Game {
    Vocab v = new Vocab();
    int totalHealth = 100;
    
    public void battle(Player att, Player def) {
        Scanner scan = new Scanner(System.in);
        String input;
        String word = this.v.pick();
        System.out.println("Type '" + word + "' !!!");
        
        while (true) {
            System.out.print("   ㄴ ");
            input = scan.nextLine();
            if (input.equals(word)) {
                def.changeHealth(-1 * att.power());
                def.limitHealth(totalHealth);
                break;
            } else {
                def.changeHealth(20);
                def.limitHealth(totalHealth);
            }
        }
    }

    public void play() {
        Player player1 = new Player(true, totalHealth);
        Player player2 = new Player(false, totalHealth);
        TimeThread th  = new TimeThread();

        int round = 1;
        int energy = 0;

        System.out.println("게임에 오신거를 환영합니다. ");
        th.start();
        while (true) {

            if (player1.health <= 0) {
                // Player2 승
                System.out.println("Player2 WINS !!!");
                break;
            }
            if (player2.health <= 0) {
                // Player1 승
                System.out.println("Player1 WINS !!!");
                break;
            }

            System.out.println("====R O U N D " + round + "=====");
            if (player1.isTurn) {
                System.out.println("  ** Player1 (HP: " + player1.health + "/" + totalHealth + ")");
                System.out.println("     Player2 (HP: " + player2.health + "/" + totalHealth + ")");
                System.out.println();
                
                th.sec = 0;
                th.t = true;
                battle(player1, player2);
                th.t = false;

                energy = th.sec;
                System.out.println("TIME : " + energy);
                player2.changeHealth(energy);
                player2.limitHealth(totalHealth);
            } else {
                System.out.println("     Player1 (HP: " + player1.health + "/" + totalHealth + ")");
                System.out.println("  ** Player2 (HP: " + player2.health + "/" + totalHealth + ")");
                System.out.println();
                
                th.sec = 0;
                th.t = true;
                battle(player2, player1);
                th.t = false;

                energy = th.sec;
                System.out.println("TIME : " + energy);
                player1.changeHealth(energy);
                player1.limitHealth(totalHealth);
            }
    
            round += 1;
            player1.isTurn = !player1.isTurn;
            player2.isTurn = !player2.isTurn;
            System.out.println();
            System.out.println();
        }
        
        th.gameOver = false;
    }
}