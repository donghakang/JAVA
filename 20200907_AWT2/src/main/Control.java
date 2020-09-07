package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JLabel;

public class Control {

    public void init() {
        Frame frame = new Frame("AWT");
        setLayout(frame);
        frame.setLayout(null);

        Font font = new Font("serif",Font.PLAIN, 30);

        Label lb1 = new Label();
        lb1.setText("안녕");
        lb1.setBounds(100, 50, 150, 50);
        lb1.setBackground(Color.red);
        lb1.setForeground(Color.white);
        lb1.setFont(font);
        frame.add(lb1);

        Label lb2 = new Label();
        lb2.setText("안녀엉");
        lb2.setBounds(100, 110, 150, 50);
        lb2.setFont(font);
        frame.add(lb2);

        TextField idTf = new TextField();
        idTf.setBounds(260, 50, 150, 50);
        idTf.setFont(font);
        frame.add(idTf);

        TextField pwTf = new TextField();
        pwTf.setBounds(260, 110, 150, 50);
        pwTf.setFont(font);
        frame.add(pwTf);

        Button btn = new Button("확인");
        btn.setBounds(420, 50, 150, 100);
        btn.setFont(font);
        frame.add(btn);

        Label contentLb = new Label();
        contentLb.setText("--");
        contentLb.setBounds(260, 300, 400, 150);
        contentLb.setFont(font);
        frame.add(contentLb);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userID = idTf.getText();
                String pass = pwTf.getText();
                contentLb.setText("입력한 id: "+ userID +" 입력한 pw: "+ pass);
            }
        });

        frame.setVisible(true);

    }

    private void setLayout(Frame frame) {
        int width = 700;
        int height = 600;
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        int posX = scr.width / 2 - (width / 2);
        int posY = scr.height / 2 - (height / 2);
        frame.setLocation(posX, posY);
        frame.setSize(width, height);
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
