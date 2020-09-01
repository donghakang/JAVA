package main;
import vocab.Vocab;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void loadVocab(ArrayList<Vocab> vocab) {
        String dir = "/Users/donghakang/Documents/JAVA/tmp/";
        String txt = dir + "vocab.txt";
        String[] saveVocab = new String[2];

        try {
            // 한 줄씩 읽기
            BufferedReader br = new BufferedReader(new FileReader(txt));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                saveVocab = line.split(", ");
                Vocab v = new Vocab();
                v.setEng(saveVocab[0]);
                v.setKor(saveVocab[1]);
                vocab.add(v);
            }
            br.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void overwrite(ArrayList<Vocab> vocab) {
        String dir = "/Users/donghakang/Documents/JAVA/tmp/";
        String txt = dir + "vocab.txt";

        FileWriter fw;

        for (int i = 0; i < vocab.size(); i ++) {
            try {
                fw = new FileWriter(txt, false);
                fw.write(vocab.get(i).getEng() + ", " + vocab.get(i).getKor() + "\n");
                fw.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String dir = "/Users/donghakang/Documents/JAVA/tmp/";
        String txt = dir + "vocab.txt";

        FileWriter fw;
        ArrayList<Vocab> vocab = new ArrayList<Vocab>();

        loadVocab(vocab);

        while (true) {
            System.out.println("길이: " + vocab.size());
            System.out.println("----------------------");
            System.out.println("|  무엇을 하시겠습니까?");
            System.out.println("|  1. 추가    2. 삭제    3. 수정   4. 끝내기");
            System.out.println("----------------------");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            if (input.equals("1")) {
                //이전에 입력한 단어보여주기
                System.out.println("[ 현 단어장 "+vocab.size()+"개 ]");
                for (int i = 0; i < vocab.size(); i++) {
                    System.out.println(vocab.get(i).getEng() + " : "+vocab.get(i).getKor());
                }
                System.out.println();
                System.out.println("추가할 단어 입력하세요");
                input = scan.nextLine();
                Vocab v = new Vocab();
                v.setEng(input);

                System.out.println("한글 뜻?");
                input = scan.nextLine();
                v.setKor(input);

                vocab.add(v);

                try {
                    fw = new FileWriter(txt, true);
                    fw.write(v.getEng() + ", " + v.getKor() + "\n");
                    fw.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else if (input.equals("2")) {
                System.out.println("[ 현 단어장 "+ vocab.size() +"개 ]");
                for (int i = 0; i < vocab.size(); i++) {
                    System.out.println((i+1)+". "+vocab.get(i).getEng() +" : "+ vocab.get(i).getKor());
                }
                System.out.println();
                System.out.println("삭제할 단어를 선택해 주세요");
                input = scan.nextLine();
                int temp = Integer.parseInt(input);
                vocab.remove( temp-1 );

                overwrite(vocab);
            }
            else if (input.equals("3")) {
                //단어보여주기
                System.out.println("[ 현 단어장 "+ vocab.size()+"개 ]");
                for (int i = 0; i < vocab.size(); i++) {
                    System.out.println((i+1)+". "+vocab.get(i).getEng());
                }
                System.out.println();
                System.out.println("수정할 단어를 선택해 주세요");
                input = scan.nextLine();
                int temp = Integer.parseInt(input);
                System.out.println("수정할 영어를 입력하세요");
                input = scan.nextLine();
                vocab.get(temp -1).setEng(input);

                System.out.println("수정할 한글뜻 입력하세요");
                input = scan.nextLine();
                vocab.get(temp - 1).setKor(input);

                overwrite(vocab);
            }
//            else if (input.equals("4")) {
//                Random rd = new Random();
//                int ranNum = rd.nextInt(engArr.size());
//                String answer = engArr.get(ranNum);
//
//                String question ="";
//
//                ArrayList<String> tempArr = new ArrayList<String>();
//                for (int i = 0; i < answer.length(); i++) {
//                    tempArr.add(answer.substring(i,i+1));
//                }
//
//                while(tempArr.size() > 0) {
//                    ranNum = rd.nextInt(tempArr.size());
//                    question = question + tempArr.get(ranNum);
//                    tempArr.remove(ranNum);
//                }
//
//                String temp = answer;
////				while(temp.length() > 0) {
////					ranNum = rd.nextInt(temp.length());
////					question = question + temp.substring(ranNum, ranNum+1);
////					temp = temp.substring(0, ranNum) + temp.substring(ranNum+1);
////					System.out.println("ranNum: "+ ranNum +",  question: "+question +", temp: "+ temp);
////				}
//                System.out.println("문제: "+ question);
//                input = scan.nextLine();
//                if(input.equals(answer)) {
//                    //정답
//                }else {
//                    //오답
//                }
//
//
//            }
            else if (input.equals("4")) {
                break;
            }else {
                System.out.println("1-4 만 입력하시오?");
            }

            System.out.println("[ 현 단어장 "+ vocab.size()+"개 ]");
            for (int i = 0; i < vocab.size(); i++) {
                System.out.println(vocab.get(i).getEng() + " : "+ vocab.get(i).getKor());
            }

            System.out.println();
            System.out.println();
        }

    }

}
