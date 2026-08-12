package baitap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class baitap6 {

    public static void main(String[] args) {

        // Tạo JFrame
        JFrame frame = new JFrame("Custom Icon Window");

        // Đặt kích thước 500x400
        frame.setSize(500, 400);

        // Đặt icon cho cửa sổ
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        // Tạo JLabel và căn giữa
        JLabel label = new JLabel(
                "Custom Icon Window",
                SwingConstants.CENTER
        );

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