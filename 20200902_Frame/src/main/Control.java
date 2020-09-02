package main;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {

    public int calculatePos(int screen, int frame) {
        return (screen / 2) - (frame / 2);
    }

    public void init() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();         // 스크린 사이즈
        System.out.println(scr.width + " : "+scr.height);

        int h = 500;
        int w = 700;
        
        int posX = calculatePos(scr.width, w);
        int posY = calculatePos(scr.height, h);

        Frame frame = new Frame("첫 번째 AWT");
        frame.setLocation(posX, posY);              // 스크린 위치
        frame.setSize(w, h);                        // 스크린 사이즈
        frame.setResizable(false);                  // 스크린의 사이즈를 변경 할 수 있는지 
        
        setLayout(frame);                           
        frame.setVisible(true);
    }



    private void setLayout(Frame frame) {
        frame.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }
}
