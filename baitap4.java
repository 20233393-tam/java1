package baitap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class baitap4 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Viewer");

        ImageIcon imageIcon = new ImageIcon("src/baitap/hinh.jpg");

        JLabel label = new JLabel(imageIcon);

        frame.add(label);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}