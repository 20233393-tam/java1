package baitap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class baitap2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Welcome");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(
            frame,
            "Welcome to Java Swing ",
            "Welcome",
            JOptionPane.INFORMATION_MESSAGE
        );

        frame.dispose();
        System.exit(0);
    }
}