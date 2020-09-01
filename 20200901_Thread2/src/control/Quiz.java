package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void run() {
        Scanner scan = new Scanner (System.in);
        String input = null;
        
        while (true) {
            System.out.println("단어 게임을 시작합니다");
            System.out.println("1. 영단어 맞추기");
            System.out.println("2. 한국단어 영어로 맞추기");
            input = scan.nextLine();
            
            if (input.equals("1")) {
                // Thread 가 시작됩니다.        
            } else if (input.equals("2")) {
                // Thread 가 끝납니다.    
            } else {
                System.out.println("숫자를 입력 하세요\n");
            }
        }
        


    }
}