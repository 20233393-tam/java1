package baitap;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class baitap8 {

    public static void main(String[] args) {

        // Tạo JFrame
        JFrame frame = new JFrame("Colored Background");

        // Đặt kích thước 400x400
        frame.setSize(400, 400);

        // Tạo JLabel
        JLabel label = new JLabel(
                "Colored Background",
                SwingConstants.CENTER
        );

        // Đặt màu nền xanh lá cho JLabel
        label.setOpaque(true);
        label.setBackground(Color.GREEN);

        // Căn giữa JLabel
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 180));

        // Thêm JLabel vào JFrame
        frame.add(label);

        // Căn giữa cửa sổ trên màn hình
        frame.setLocationRelativeTo(null);

        // Đóng chương trình khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}