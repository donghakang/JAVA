package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하시오: ");
        String input = scan.nextLine();

        try {
            int num = Integer.parseInt(input);
            num *= 2;
            System.out.println(num);

            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 3;

        } catch (NumberFormatException e) {
            System.out.println("LMSG: " + e.getLocalizedMessage());
            System.out.println("MSG : " + e.getMessage());
            System.out.println("trac: " + e.getStackTrace());
            System.out.println("숫자를 넣으라니깐");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 오류");
        } catch(Exception e) {
            System.out.println("모든 오류");
        }                                             // 모든 오류를 없앤다. 각기 다른 에러 핸들링이 필요없을때


        System.out.println("프로그램 종료");
    }
}
