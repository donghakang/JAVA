package canvas;

import java.awt.*;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;

public class Control {
    public int screenX; // 화면 사이즈
    public int screenY;
    public int canvasX;
    public int canvasY;

    public String playerName;
    public boolean save;

    private GameCanvas canvas;

    public Control() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        this.screenX = scr.width;
        this.screenY = scr.height;
        this.canvasX = 700;
        this.canvasY = 700;

        this.save = false;

    }

    public void play() {
        // Frame Setup
        Frame frame = new Frame("AWT");
        setLayout(frame); // frame setup
        frame.setLayout(null);

        // Canvas Setup
        canvas = new GameCanvas(this.canvasX, this.canvasY);
        initFrame(frame);

        // Frame 출력
        frame.add(canvas);
        frame.setVisible(true);        
    }

    private void initGame(GameCanvas canvas) {
        canvas.setup();
        canvas.setSize(this.canvasX, this.canvasY);
        canvas.setLocation(0, 80);
        canvas.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 39:
                        canvas.actor.player.isRight = false;
                        break;
                    case 37:
                        canvas.actor.player.isLeft = false;
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 89:                    // Y key
                        canvas.actor.init();
                        break;
                    case 32:                    // space bar
                        System.out.println(canvas.actor.player.getName());
                        canvas.isGameMode = !canvas.isGameMode;
                        canvas.actor.isGameMode = !canvas.actor.isGameMode;
                        canvas.actor.score = 0;
                        break;
                    case 39:
                        canvas.actor.player.isRight = true;
                        break;
                    case 37:
                        canvas.actor.player.isLeft = true;
                        break;
                }

            }
        });
    }


    private void initFrame(Frame f) {
        Font font = new Font("arial",Font.PLAIN, 30);
        Font font2 = new Font("arial",Font.PLAIN, 20);
        // f.setBackground(new Color (12, 6, 42));
        f.setBackground(Color.black);
        Label lb1 = new Label();
        lb1.setText("ID : ");
        lb1.setBounds(50, 25, 80, 50);
        lb1.setForeground(Color.white);
        lb1.setFont(font);
        f.add(lb1);

        TextField idTf = new TextField();
        idTf.setBounds(130, 25, 250, 50);
        idTf.setFont(font2);
        f.add(idTf);

        Button btn = new Button("확인");
        btn.setBounds(400, 25, 80, 50);
        btn.setFont(font2);
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userID = idTf.getText();
                playerName = userID;
                
                lb1.setText("Hi, " + playerName);
                lb1.setBounds(50, 25, 250, 50);
                if (playerName.equals("")) {
                    f.remove(lb1);
                }

                f.remove(idTf);
                f.remove(btn);

                canvas.init();
                canvas.actor.player.setName(playerName);
                
            
                initGame(canvas);
            }
        });
    }

    private void setLayout(Frame frame) {
        int posX = this.screenX / 2 - (this.canvasX / 2);
        int posY = this.screenY / 2 - (this.canvasY / 2);
        frame.setLocation(posX, posY);
        frame.setSize(this.canvasX, this.canvasY + 80);
        frame.setResizable(false);

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }
        });
    }
}
