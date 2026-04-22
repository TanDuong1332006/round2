import javax.swing.*;
import java.awt.*;

public class GiaoDienChinh extends JFrame {
    private JTextField txtInput;
    private JTextArea txtKetQua;

    public GiaoDienChinh() {
        setTitle("Phần mềm Tổng hợp");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Khu vực nhập dữ liệu
        JPanel pnlNhap = new JPanel(new FlowLayout());
        pnlNhap.add(new JLabel("Nhập số:"));
        txtInput = new JTextField(15);
        pnlNhap.add(txtInput);
        add(pnlNhap, BorderLayout.NORTH);

        // Khu vực nút bấm
        JPanel pnlNut = new JPanel(new GridLayout(2, 1, 5, 5));
        JButton btnBai2 = new JButton("Câu 2: Đảo ngược số");
        JButton btnBai3 = new JButton("Câu 3: Kiểm tra đối xứng");
        pnlNut.add(btnBai2);
        pnlNut.add(btnBai3);
        add(pnlNut, BorderLayout.CENTER);

        // Khu vực hiển thị kết quả
        txtKetQua = new JTextArea(5, 20);
        txtKetQua.setEditable(false);
        txtKetQua.setBorder(BorderFactory.createTitledBorder("Kết quả"));
        add(new JScrollPane(txtKetQua), BorderLayout.SOUTH);

        // --- SỰ KIỆN GỘP CODE ---

        btnBai2.addActionListener(e -> {
            String s = txtInput.getText();
            // Gọi hàm từ file Bai2Logic
            txtKetQua.setText(Bai2Logic.daoNguoc(s));
        });

        btnBai3.addActionListener(e -> {
            String s = txtInput.getText();
            // Gọi hàm từ file Bai3Logic
            txtKetQua.setText(Bai3Logic.kiemTraDoiXung(s));
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GiaoDienChinh().setVisible(true);
        });
    }
}