package baitap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class Bai3 extends JFrame {

    private JTextField txtN;
    private JButton btnCalculate;
    private JLabel lblResult;
    private JProgressBar progressBar;
    private JTextArea txtProcess;

    public Bai3() {

        setTitle("Bài 3 - Tính tổng các số nguyên tố nhỏ hơn N");
        setSize(650, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel lblN = new JLabel("Nhập N:");

        txtN = new JTextField(15);

        btnCalculate = new JButton("Tính");

        inputPanel.add(lblN);
        inputPanel.add(txtN);
        inputPanel.add(btnCalculate);

        lblResult = new JLabel("Kết quả sẽ hiển thị ở đây");

        lblResult.setFont(new Font("Arial", Font.BOLD, 16));

        progressBar = new JProgressBar(0, 100);

        progressBar.setStringPainted(true);

        txtProcess = new JTextArea();

        txtProcess.setEditable(false);

        txtProcess.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(txtProcess);

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));

        centerPanel.add(lblResult, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        centerPanel.add(progressBar, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        btnCalculate.addActionListener(e -> calculatePrimeSum());
    }

    private boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private void calculatePrimeSum() {

        int n;

        try {

            n = Integer.parseInt(txtN.getText().trim());

            if (n <= 2) {

                JOptionPane.showMessageDialog(
                        this,
                        "N phải lớn hơn 2",
                        "Thông báo",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng nhập số nguyên hợp lệ",
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        btnCalculate.setEnabled(false);

        progressBar.setValue(0);

        lblResult.setText("Đang tính...");

        txtProcess.setText("");

        txtProcess.append(
                "========================================\n"
        );

        txtProcess.append(
                "TÍNH TỔNG CÁC SỐ NGUYÊN TỐ NHỎ HƠN N\n"
        );

        txtProcess.append(
                "========================================\n\n"
        );

        txtProcess.append(
                "N = " + n + "\n\n"
        );

        txtProcess.append(
                "Bắt đầu kiểm tra các số từ 2 đến "
                + (n - 1) + "...\n\n"
        );

        SwingWorker<Long, String> worker =
                new SwingWorker<Long, String>() {

            @Override
            protected Long doInBackground() {

                long sum = 0;

                StringBuilder primeNumbers =
                        new StringBuilder();

                StringBuilder calculation =
                        new StringBuilder();

                boolean firstPrime = true;

                // Duyệt từ 2 đến n - 1
                for (int i = 2; i < n; i++) {

                    if (isPrime(i)) {

                        sum += i;

                        // Lưu danh sách số nguyên tố
                        if (!firstPrime) {
                            primeNumbers.append(", ");
                        }

                        primeNumbers.append(i);

                        firstPrime = false;

                        // Tạo phép cộng
                        if (calculation.length() > 0) {
                            calculation.append(" + ");
                        }

                        calculation.append(i);

                        publish(
                                i + " là số nguyên tố"
                                + " → Tổng hiện tại = "
                                + sum
                        );

                    } else {

                        publish(
                                i + " không phải số nguyên tố"
                        );
                    }

                    // Tính tiến trình
                    int progress =
                            (int) ((i * 100.0) / n);

                    setProgress(progress);

                    // Tạo độ trễ nhỏ để dễ quan sát
                    try {

                        Thread.sleep(50);

                    } catch (InterruptedException ex) {

                        Thread.currentThread().interrupt();
                    }
                }

                // Hiển thị danh sách số nguyên tố
                publish("");

                publish(
                        "Các số nguyên tố nhỏ hơn "
                        + n + ": "
                        + primeNumbers
                );

                publish("");

                publish(
                        "Phép tính: "
                        + calculation
                        + " = "
                        + sum
                );

                publish(
                        "Tổng = " + sum
                );

                return sum;
            }

            protected void process(
                    java.util.List<String> chunks) {

                for (String text : chunks) {

                    txtProcess.append(
                            text + "\n"
                    );

                    // Tự động cuộn xuống cuối
                    txtProcess.setCaretPosition(
                            txtProcess.getDocument().getLength()
                    );
                }
            }

            protected void done() {

                try {

                    long result = get();

                    lblResult.setText(
                            "KẾT QUẢ: Tổng các số nguyên tố "
                            + "nhỏ hơn " + n
                            + " = " + result
                    );

                    txtProcess.append(
                            "\n========================================\n"
                    );

                    txtProcess.append(
                            "HOÀN THÀNH!\n"
                    );

                    txtProcess.append(
                            "KẾT QUẢ CUỐI CÙNG = "
                            + result + "\n"
                    );

                    txtProcess.append(
                            "========================================\n"
                    );

                } catch (Exception ex) {

                    lblResult.setText(
                            "Có lỗi khi tính toán"
                    );

                    txtProcess.append(
                            "\nCó lỗi xảy ra: "
                            + ex.getMessage()
                            + "\n"
                    );
                }

                btnCalculate.setEnabled(true);

                progressBar.setValue(100);
            }
        };

      
        worker.addPropertyChangeListener(evt -> {

            if ("progress".equals(
                    evt.getPropertyName())) {

                int progress =
                        (int) evt.getNewValue();

                progressBar.setValue(progress);
            }
        });

 
        worker.execute();
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            Bai3 form = new Bai3();

            form.setVisible(true);
        });
    }
}