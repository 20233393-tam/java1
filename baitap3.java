package baitap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class baitap3 {

    public static void main(String[] args) {

        // Tạo JFrame
        JFrame frame = new JFrame("Exit Application");

        // Đặt kích thước 300x200
        frame.setSize(300, 200);

        // Đặt vị trí cửa sổ ở giữa màn hình
        frame.setLocationRelativeTo(null);

        // Đóng chương trình khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo nút Exit
        JButton btnExit = new JButton("Exit");

        // Thêm nút vào JFrame
        frame.add(btnExit);

        // Xử lý sự kiện khi nhấn nút Exit
        btnExit.addActionListener(e -> {
            System.exit(0);
        });

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}