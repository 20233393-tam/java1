package baitap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class baitap1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Swing App");

        frame.setSize(400, 300);

        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}