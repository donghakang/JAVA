import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    ArrayList<String> vocab;
    ArrayList<String> ex1, ex2, ex3, ex4, ex5;
    ArrayList<Integer> answer;

    Quiz() {
        vocab = new ArrayList<String>();
        ex1   = new ArrayList<String>();
        ex2   = new ArrayList<String>();
        ex3   = new ArrayList<String>();
        ex4   = new ArrayList<String>();
        ex5   = new ArrayList<String>();
        answer = new ArrayList<Integer>();

        vocab.add("Water");
        ex1.add("물");
        ex2.add("불");
        ex3.add("땅");
        ex4.add("바람");
        ex5.add("폭발");
        answer.add(1);

        vocab.add("construct");
        ex1.add("철거하다");
        ex2.add("제거하다");
        ex3.add("건설하다");
        ex4.add("정비하다");
        ex5.add("도와주다");
        answer.add(3);

        vocab.add("hatred");
        ex1.add("모자");
        ex2.add("사악한");
        ex3.add("사랑");
        ex4.add("혐오");
        ex5.add("존중");
        answer.add(4);

        vocab.add("deny");
        ex1.add("복귀하다");
        ex2.add("부인하다");
        ex3.add("제거하다");
        ex4.add("상호작용");
        ex5.add("흥미를 가지다");
        answer.add(4);
    }

    boolean quiz() {
        int random = new Random().nextInt(this.vocab.size());
        String ans;
        int answer;
        Scanner scan = new Scanner(System.in);
        boolean keyValid = false;

        while (true) {
            System.out.println("영어 단어 퀴즈!!");
            System.out.println("단어를 맞추시오...\n");
            System.out.println(vocab.get(random));
            System.out.println("1. " + ex1.get(random));
            System.out.println("2. " + ex2.get(random));
            System.out.println("3. " + ex3.get(random));
            System.out.println("4. " + ex4.get(random));
            System.out.println("5. " + ex5.get(random));

            System.out.print("  ㄴ 답변 : ");
            ans = scan.nextLine();
            answer = Integer.parseInt(ans);

            if (answer == this.answer.get(random)) {
                System.out.println("정답입니다! 1번 열쇠를 지급 받으셨습니다.");
                keyValid = true;
                break;
            } else {
                System.out.println("오답입니다, 다시 플레이 하시겠습니까? (Y/N)");
                System.out.print("   ㄴ 답변 : ");
                ans = scan.nextLine();

                if (ans.equals("Y") || ans.equals("y")) {
                    continue;
                } else if (ans.equals("N") || ans.equals("n")) {
                    System.out.println("GAME OVER...");
                    keyValid = false;
                    break;
                } else {
                    break;
                }
            }
        }

        return keyValid;

    }


}