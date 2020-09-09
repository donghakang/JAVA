package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SaveData {
    private String dir = "./data/score.txt";
    public ArrayList<Integer> scoreboard = new ArrayList<>();
    public boolean isSaved = false;

    public String text(int score) {
        addScore(score);
        readScore();
        return printScoreboard();
    }

    public void readScore() {
        try {
			// 한 줄씩 읽기
			BufferedReader br = new BufferedReader(new FileReader(dir));
			while (true) {
                String line = br.readLine();
                try {
                    scoreboard.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.out.println(line);
                }

				if (line == null)
					break;
				
			}
			br.close();
		} catch (final FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        sort();
    }

    public void addScore(int score) {
        FileWriter fw;
        System.out.println(score);
        try {
            fw = new FileWriter(dir, true);
            fw.write(score + "\n");
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sort() {
        Collections.sort(this.scoreboard);
    }

    public String printScoreboard() {
        String s = ""; 
        int score;
        if (this.scoreboard.size() > 10) {
            for (int i = 1; i <= 10; i ++) {
                s += i + "등 : ";
                score = this.scoreboard.get(this.scoreboard.size() - i);
                s += score + "\n";
            }
        } else {
            for (int i = 0; i < this.scoreboard.size(); i++) {
                s += i + "등 : ";
                score = this.scoreboard.get(this.scoreboard.size() - i);
                s += score + "\n";
            }
        }
        
        return s;
    }
}
