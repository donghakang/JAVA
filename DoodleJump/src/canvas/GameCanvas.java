package canvas;

import java.awt.*;
import java.io.FileWriter;

import control.Actor;
import control.Brick;
import control.SaveData;

public class GameCanvas extends Canvas {
    // 환경
    int canvasX;
    int canvasY;

    int[] bgColor = new int[3];
    boolean isBrighter = false;
    int bgColorTmp = 0;

    // 게임
    Actor actor;

    public boolean isGameMode; // 실행화면 혹은 게임화면
    public SaveData data;
    public Image img;
    public Image player_img;

    // MARK: 설정
    public GameCanvas(int canvasX, int canvasY) {
        this.canvasX = canvasX;
        this.canvasY = canvasY;
        this.isGameMode = false;
        this.bgColor[0] = 12;
        this.bgColor[1] = 6;
        this.bgColor[2] = 42;

        init();
    }

    public void init() {
        data  = new SaveData();
        actor = new Actor(this.canvasX, this.canvasY);
    }

    public void setup() {
        this.img = (getToolkit().getDefaultToolkit()).getImage("./img/launch_img.png");
        this.player_img = (getToolkit().getDefaultToolkit()).getImage("./img/img1.png");

        this.isBrighter = false;
        this.bgColorTmp = 0;

        TimeThread th1 = new TimeThread();
        th1.start();

        // ScoreThread th2 = new ScoreThread();
        // th2.start();
    }



    // MARK: 꾸미기
    public synchronized void scoreAdd() {
        if (!actor.player.isFalling) {
            this.actor.score += 3;
        }
    }

    public void updateBackground() {
        int tmp = 0;
        tmp = this.actor.score / 10 - (200 * this.bgColorTmp);

        if (this.isBrighter) {
            this.bgColor[0] = 212 - tmp;
            this.bgColor[1] = 206 - tmp;
            this.bgColor[2] = 242 - tmp;
        } else {
            this.bgColor[0] = tmp + 12;
            this.bgColor[1] = tmp + 6;
            this.bgColor[2] = tmp + 42;
        }

        if (tmp % 200 == 199) {
            this.bgColorTmp += 1;
            this.isBrighter = !this.isBrighter;
        }
    }

    public void updateBrickColor() {
        int tmp = 0;
        tmp = this.actor.score / 10 - (200 * this.bgColorTmp);

        if (this.isBrighter) {
            Color c = new Color(tmp + 0, tmp + 55, tmp + 20);
            for (int i = 0; i < this.actor.bricks.size(); i++) {

                this.actor.bricks.get(i).color = c;
            }
        } else {
            Color c = new Color(200 - tmp, 255 - tmp, 220 - tmp);
            for (int i = 0; i < this.actor.bricks.size(); i++) {

                this.actor.bricks.get(i).color = c;
            }
        }
    }

    void drawString(Graphics2D g, String text, int x, int y) {
        for (String line : text.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }

    private void launchView(Graphics2D g2) {
        Font font = new Font("Arial", Font.BOLD, 60);
        Font font2 = new Font("Arial", Font.PLAIN, 20);
        Font f = new Font("Arial", Font.PLAIN, 10);

        try {
            setBackground(new Color(this.bgColor[0], this.bgColor[1], this.bgColor[2], 255));
        } catch (IllegalArgumentException e) {
            setBackground(new Color(12, 6, 42));
        }

        g2.drawImage(this.img, 0, 0, this.canvasX / 2, this.canvasY / 2, this);

        g2.setFont(font);
        g2.setColor(Color.white);
        g2.drawString("D O O D L E", this.canvasX / 6 + 20, this.canvasY / 2 - 100);
        g2.drawString("   E G I  ", this.canvasX / 2 + 35, this.canvasY / 2);

        g2.setFont(font2);
        g2.setColor(Color.gray);
        FontMetrics fontMetrics = g2.getFontMetrics();
        String s = "Press <start> to play";
        g2.drawString(s, this.canvasX / 2 - fontMetrics.stringWidth(s) / 2, this.canvasY * 3 / 4);

        g2.setFont(f);
        g2.setColor(Color.yellow);
        g2.drawString("참고로, 애기는 저의 집 강아지 이름입니다.", this.canvasX * 1 / 2 + 100, this.canvasY / 2 + 100);
        g2.drawString("13살 입니다.", this.canvasX * 1 / 2 + 100, this.canvasY / 2 + 120);
    }

    private void gameOverView(Graphics2D g2) {
        Font font = new Font("Arial", Font.BOLD, 50);
        Font font2 = new Font("Arial", Font.PLAIN, 20);
        this.isBrighter = false;
        this.bgColorTmp = 0;

        g2.setFont(font);
        g2.setColor(Color.white);
        FontMetrics fontMetrics1 = g2.getFontMetrics();
        String s1 = "G A M E O V E R";
        g2.drawString(s1, this.canvasX / 2 - fontMetrics1.stringWidth(s1) / 2, this.canvasY / 4);

        g2.setFont(font2);
        FontMetrics fontMetrics2 = g2.getFontMetrics();
        String s2 = "다시 플레이 하시려면 Y 를 누르시오";
        g2.drawString(s2, this.canvasX / 2 - fontMetrics2.stringWidth(s2) / 2, this.canvasY * 3 / 4);
    }

    public int returnScore() {
        return this.actor.score;
    }

    // 게임 플레이
    private void playView(Graphics2D g2) {
        Font font2 = new Font("Arial", Font.PLAIN, 25);
        try {
            updateBackground();
            updateBrickColor();
            setBackground(new Color(this.bgColor[0], this.bgColor[1], this.bgColor[2], 255));
        } catch (IllegalArgumentException e) {
            // 아무일 안일어난다.
        }

        for (int i = 0; i < actor.bricks.size(); i++) {
            g2.setColor(actor.bricks.get(i).color);
            Brick brick = actor.bricks.get(i);
            g2.fillRect(brick.posX, brick.posY, brick.width, brick.height);
        }

        // Player
        g2.drawImage(this.player_img, actor.player.posX - 15, actor.player.posY - 20, 80, 85, this);
        // g2.fillOval(actor.player.posX, actor.player.posY, actor.player.size,
        // actor.player.size);
        g2.setFont(font2);
        g2.setColor(Color.white);
        g2.drawString("Score: " + this.actor.score, 50, 90);
    }

    // MARK: 그림그리기
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        if (this.isGameMode) {
            playView(g2);
            if (!actor.player.isAlive) {
                gameOverView(g2);
            }
        } else {
            launchView(g2);
        }
    }

    class TimeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                actor.update();
                scoreAdd();
                repaint();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }

    /**  
    class ScoreThread extends Thread {
        String scoreboard = "";
        String playerName = "";

        @Override
        public void run() {
            while (true) {
                if (isGameMode) {
                    // 게임모드 
                    if (!actor.player.isAlive) {
                        // 죽었을때
                        if (data.isSaved == false) {
                            playerName = actor.player.getName();
                            if (!playerName.equals("")) {
                                // 플레이어 이름이 있다면,
                                data.addScore(actor.score);
                                // System.out.println(actor.player.getName() + "   " + actor.score);
                            }
                            
                            data.readScore();
                            scoreboard = data.printScoreboard();
                            
                            if (scoreboard == null) {
                                //만약 아무 데이터 없다면.
                                scoreboard = "";
                            }
                            // System.out.println(scoreboard);

                            data.isSaved = true;
                        }
                    }
                } else {
                    // 게임이 시작할때
                    data.isSaved = false;
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    */
}
