package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Vocab {
    private ArrayList<String> vocab = new ArrayList<>();

    public Vocab() {
        try {
            String dir = System.getProperty("user.dir");
            String txt = dir + "/lib/words.txt";

            // 한 줄씩 읽기
            BufferedReader br = new BufferedReader(new FileReader(txt));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                vocab.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String pick() {
        String word = this.vocab.get(new Random().nextInt(this.vocab.size()));

        return word;
    }


}