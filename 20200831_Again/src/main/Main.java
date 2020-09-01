package main;

import model.Days;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> task = new ArrayList<>();
        ArrayList<Days>   content = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input;

        int date;
        int day;
        int month;
        int year;

        while (true) {
            System.out.println("1. 수정하기");
            System.out.println("2. 확인하기");

            input = scan.nextLine();

            if (input.equals("1")) {
                System.out.println("월 : ");
                input = scan.nextLine();
                month = Integer.parseInt(input);
                System.out.println("일 : ");
                input = scan.nextLine();
                date = Integer.parseInt(input);
                System.out.println("년 : ");
                input = scan.nextLine();
                year = Integer.parseInt(input);
                System.out.println("요일 : ");
                input = scan.nextLine();
                day = Integer.parseInt(input);
                System.out.println("무엇을 공부 했습니까? : ");
                input = scan.nextLine();

                Days dd = new Days(month, date, year, day);

                task.add(input);
                content.add(dd);


            } else if (input.equals("2")) {
                for (int i = 0; i < task.size(); i ++) {
                    content.get(i).display();
                    System.out.println("   ㄴ " + task.get(i));
                }
            } else {
                System.out.println("1, 2번 만 눌러주세요");
            }
        }
    }
}
