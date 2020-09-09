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
    private ArrayList<Integer> scoreboard = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    public boolean isSaved = false;

    public void readScore() {
        String[] l;
        try {
			// 한 줄씩 읽기
			BufferedReader br = new BufferedReader(new FileReader(dir));
			while (true) {
                String line = br.readLine();

                if (line == null)
					break;

                System.out.println(line);
                l = line.split(":");
                names.add(l[0]);
                try {
                    scoreboard.add(Integer.parseInt(l[1]));
                } catch (NumberFormatException e) {
                    System.out.println(line);
                }
            }
		} catch (final FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
        sort();
    }

    public void addScore(String name, int score) {
        FileWriter fw;
        try {
            fw = new FileWriter(dir, true);
            fw.write(name + ":" + score + "\n");
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
                s += score + "점\n";
            }
        } else {
            for (int i = 1; i <= this.scoreboard.size(); i++) {
                s += i + "등 : ";
                score = this.scoreboard.get(this.scoreboard.size() - i);
                s += score + "점\n";
            }
        }
        
        return s;
    }
}
