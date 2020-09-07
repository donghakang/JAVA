package control;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {
    public int screenX;           // 화면 사이즈
    public int screenY;
    public int canvasX;
    public int canvasY;
    

    public Control() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        this.screenX = scr.width;
        this.screenY = scr.height;
        this.canvasX = this.screenX / 2;
        this.canvasY = this.canvasX;
    }


    public void play() {
        // Frame Setup
        Frame frame = new Frame("AWT");
        setLayout(frame);                   // frame setup
        frame.setLayout(null);

        // Canvas Setup
        GameCanvas canvas = new GameCanvas(this.canvasX, this.canvasY);

        canvas.setSize(this.canvasX, this.canvasY);
        canvas.setLocation(0, 0);

        canvas.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 39:
                        canvas.actor.ball.isRight = false;
                        break;
                    case 37:
                        canvas.actor.ball.isLeft = false;
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 89:
                        canvas.actor.init();
                        break;
                    case 32:            // space bar
                        canvas.isGameMode = !canvas.isGameMode;
                        canvas.actor.isGameMode = !canvas.actor.isGameMode;
                        break;
                    case 39:
                        canvas.actor.ball.isRight = true;
                        break;
                    case 37:
                        canvas.actor.ball.isLeft = true;
                        break;
                }

            }
        });

        // Frame 출력
        frame.add(canvas);
        frame.setVisible(true);
    }




    private void setLayout(Frame frame) {
        int posX = this.screenX / 2 - (this.canvasX / 2);
        int posY = this.screenY / 2 - (this.canvasY / 2);
        frame.setLocation(posX, posY);
        frame.setSize(this.canvasX, this.canvasY);
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
