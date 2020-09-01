package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Quiz {
    ArrayList<Vocab> vocab; 

    public Quiz() {
        String dir = "/Users/donghakang/Documents/JAVA/tmp/";
        String vocabTxt = dir + "vocab.txt";
        vocab = new ArrayList<Vocab>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(vocabTxt));
            String[] tmpVocab = null;

			while (true) {
                String line = br.readLine();
                if (line == null)     break;
                
                tmpVocab = line.split(",");    
                vocab.add(new Vocab(tmpVocab[1], tmpVocab[0]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    public void korQuestion() {
        Scanner scan = new Scanner (System.in);
        String input = null;
        
        for (int i = 0; i < vocab.size(); i++) {
            System.out.print(vocab.get(i).getKor() + "를 영어로: ");
            input = scan.nextLine();
            if (vocab.get(i).matchEng(input)) {
                continue;
            } else {
                i --;
            }
        }
    }

    public void engQuestion() {
        Scanner scan = new Scanner (System.in);
        String input = null;
        
        for (int i = 0; i < vocab.size(); i++) {
            System.out.print(vocab.get(i).getEng() + "를 한국어로: ");
            input = scan.nextLine();
            if (vocab.get(i).matchKor(input)) {
                continue;
            } else {
                i --;
            }
        }
    }

    public void run() {
        Scanner scan = new Scanner (System.in);
        String input = null;
        

        while (true) {
            

            System.out.println("단어 게임을 시작합니다");
            System.out.println("1. 영단어 맞추기");
            System.out.println("2. 한국단어 영어로 맞추기");
            System.out.println("3. EXIT");
            input = scan.nextLine();
            
            if (input.equals("1")) {
                // Thread 가 시작됩니다.    
                MyThread th = new MyThread();
                th.start();    
                korQuestion();
                System.out.println();

                int totalTime = th.returnSecond();
                System.out.println("총  시간: " + totalTime + "초");
                System.out.println("평균 시간: " + (totalTime / vocab.size()) + "초");

                th.end();
            } else if (input.equals("2")) {
                // Thread 가 끝납니다.    
                MyThread th = new MyThread();
                th.start();    
                engQuestion();
                System.out.println();

                int totalTime = th.returnSecond();
                System.out.println("총  시간: " + totalTime + "초");
                System.out.println("평균 시간: " + (totalTime / vocab.size()) + "초");

                th.end();
            } else if (input.equals("3")) {
                System.out.println("게임이 종료 됩니다.");
                break;
            }
            else {
                System.out.println("숫자를 입력 하세요\n");
            }

            System.out.println();
        }
    }
}