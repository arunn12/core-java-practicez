/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswings;

import javax.swing.*;

public class Myswings {

    JFrame f;

    Myswings() {
        f = new JFrame();

        JButton b = new JButton("click me");
        b.setBounds(120, 90, 90, 50);
        f.add(b);
        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Myswings();
    }
}
