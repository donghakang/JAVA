import java.util.Scanner;

public class Game {

    void instruction() {
        System.out.println("미로 게임에 오신것을 환영합니다");
        System.out.println("두 개의 키를 찾고, 이 밖을 나가십시오!");

        System.out.println("이동하기 위해 'W', 'A', 'S', 'D'를 누르시오");
        System.out.println("플레이어의 위치를 보기 위해 'M' 키를 누르시오");
    }

    void play() {
        Scanner scan = new Scanner(System.in);
        String input;

        Player p = new Player();
        Maze m = new Maze();
        Quiz q = new Quiz();

        this.instruction();

        while (!p.dest) {
            System.out.print("   ㄴ 키 입력: ");
            input = scan.nextLine();
            if (input.equals("M") || input.equals("m"))  p.print();
            else p.enter(input, m);

            if (p.x == 4 && p.y == 0) {
                // 1번 키가 있는 방
                if (p.key1) {
                    System.out.println("이미 첫번째 키를 가지고 있습니다");
                    p.x -= 1;
                } else {
                    if (q.quiz()) {
                        System.out.println("정답입니다! 첫번째 키를 받았습니다");
                        System.out.println("전 방으로 이동합니다.");
                        p.x -= 1;
                        p.key1 = true;
                    } else {
                        break;
                    }
                }
            } else if (p.x == 0 && p.y == 2) {
                // 2번 키가 있는 방
                if (p.key2) {
                    System.out.println("이미 두번째 키를 가지고 있습니다");
                    p.y += 1;
                } else {
                    System.out.println("축하합니다, 두번째 키를 받았습니다");
                    System.out.println("전 방으로 이동합니다.");
                    p.y += 1;
                    p.key2 = true;
                }
            } else if (p.x == 4 && p.y == 2) {
                // 게임 오버
                System.out.println("탈출에 성공 하셨습니다! 축하합니다!!");
                break;
            } else {
                continue;
            }
        }

    }

}
