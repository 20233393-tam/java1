package baitap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class baitap5 {

    public static void main(String[] args) {

        // Tạo JFrame
        JFrame frame = new JFrame("Digital Clock");

        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();

        // Định dạng thời gian
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String currentTime = now.format(formatter);

        // Tạo JLabel và căn giữa
        JLabel label = new JLabel(currentTime, SwingConstants.CENTER);

        // Thêm JLabel vào JFrame
        frame.add(label);

        // Kích thước cửa sổ
        frame.setSize(400, 200);

        // Căn giữa màn hình
        frame.setLocationRelativeTo(null);

        // Đóng chương trình khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}