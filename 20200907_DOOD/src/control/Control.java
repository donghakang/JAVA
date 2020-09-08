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

    private boolean isGame;


    public Control() {
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        this.screenX = scr.width;
        this.screenY = scr.height;
    
        this.canvasX = 700;
        this.canvasY = 700;
        

        this.isGame = false;
    }

    public void init() {
        Frame frame1 = new Frame("hello");
        Frame frame2 = new Frame("boy");
        setLayout(frame1);
        setLayout(frame2);
        frame1.setLayout(null);
        frame2.setLayout(null);
        frame1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
        
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 89:                    // Y key
                        break;
                    case 32:                    // space bar
                        isGame = !isGame;
                        break;
                    case 39:
                        break;
                    case 37:
                        break;
                }

            }
        });

        frame2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
        
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 89:                    // Y key
                        break;
                    case 32:                    // space bar
                        isGame = !isGame;
                        break;
                    case 39:
                        break;
                    case 37:
                        break;
                }

            }  
        });
        
        frame1.setVisible(isGame);
        frame2.setVisible(!isGame);

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
