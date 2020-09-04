package control;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {
    public int w;           // 화면 사이즈
    public int h;
    public int canvasX;
    public int canvasY;

    public Control() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        this.w = scr.width;
        this.h = scr.height;
        this.canvasX = this.w / 2;
        this.canvasY = this.h / 2;
    }

    public int getW() {
        return this.canvasX;
    }

    public int getH() {
        return this.canvasY;
    }

    public void init() {
        Frame frame = new Frame("AWT");
        setLayout(frame);                   // frame setup
        frame.setLayout(null);

        MyCanvas can = new MyCanvas(this.w, this.h);
        can.setSize(this.canvasX, this.canvasY);
        can.setLocation(0, 0);
        can.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 39:
                        can.mainBall.isRight = false;
                        break;
                    case 37:
                        can.mainBall.isLeft = false;
                        break;
                    case 38:
                        can.mainBall.isUp = false;
                        break;
                    case 40:
                        can.mainBall.isDown = false;
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("P: " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case 10:
                        can.addBall();
                        break;
                    case 39:
                        can.mainBall.isRight = true;
                        break;
                    case 37:
                        can.mainBall.isLeft = true;
                        break;
                    case 38:
                        can.mainBall.isUp = true;
                        break;
                    case 40:
                        can.mainBall.isDown = true;
                        break;
                }

            }
        });

        frame.add(can);
        frame.setVisible(true);

    }

    private void setLayout(Frame frame) {
        int posX = this.w / 2 - (this.canvasX / 2);
        int posY = this.h / 2 - (this.canvasY / 2);
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
