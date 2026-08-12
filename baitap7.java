package baitap;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class baitap7 {

    public static void main(String[] args) {

        // Tạo JFrame
        JFrame frame = new JFrame("Resizable Window");

        // Kích thước ban đầu 400x300
        frame.setSize(400, 300);

        // Kích thước tối thiểu 200x150
        frame.setMinimumSize(new Dimension(200, 150));

        // Kích thước tối đa 800x600
        frame.setMaximumSize(new Dimension(800, 600));

        // Tạo JLabel và căn giữa
        JLabel label = new JLabel(
                "Resizable Window",
                SwingConstants.CENTER
        );

        // Thêm JLabel vào JFrame
        frame.add(label);

        // Căn giữa màn hình
        frame.setLocationRelativeTo(null);

        // Đóng chương trình khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}