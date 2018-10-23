package myswingbutn;

import javax.swing.*;

public class Myswingbutn {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click-me");
        b.setBounds(90, 120, 60, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
