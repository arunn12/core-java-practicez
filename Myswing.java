package myswing;

import javax.swing.*;

public class Myswing {

    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("click me");
        b.setBounds(120, 90, 120, 50);

        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
