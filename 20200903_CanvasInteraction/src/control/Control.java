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
    public int w;
    public int h;

    public Control() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        this.w = scr.width;
        this.h = scr.height;
    }

    public int getW() {
        return this.w;
    }

    public int getH() {
        return this.h;
    }

    public void init() {
        Frame frame = new Frame("ù ��° AWT");
        setLayout(frame);
        frame.setLayout(null);

        MyCanvas can = new MyCanvas(this.w, this.h);
        can.setSize(this.w, this.h);
        can.setLocation(0, 0);
        can.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
//				System.out.println("R: "+e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("P: " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case 32:
                        can.addBall();
                        break;
                }
            }
        });

        frame.add(can);
        frame.setVisible(true); // �����ֱ�

    }

    private void setLayout(Frame frame) {

        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println(scr.width + " : "+scr.height);
        int posX = scr.width / 2 - (this.w / 2);
        int posY = scr.height / 2 - (this.h / 2);
        frame.setLocation(1920 + posX, posY);
        frame.setSize(this.w, this.h);
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
