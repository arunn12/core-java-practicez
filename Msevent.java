package msevent;

import java.awt.event.*;
import javax.swing.*;

public class Msevent {

    public static void main(String[] args) {
        JFrame f = new JFrame("Button");
        final JTextField tf;
        tf = new JTextField();
        tf.setBounds(90, 90, 160, 30);
        JButton b = new JButton("click");
        b.setBounds(60, 110, 85, 40);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("come to swing app");
            }
        }
        );
        f.add(b);
        f.add(tf);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
